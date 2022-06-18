package service;

import dao.UserMapper;
import model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String register(MyUser myUser) {
        List<MyUser> myUsers = userMapper.selectUserByUname(myUser.getUname());
        if (myUsers.size() > 0) { //用户名已占用
            return "error";
        }

        Integer register = userMapper.register(myUser);
        System.out.println("register = " + register);
        if (register > 0) {
            return "redirect:/user/tologin";
        } else {
            return "error";
        }
    }

    @Override
    public String login(MyUser myUser, Model model, HttpSession session) {
        List<MyUser> login = userMapper.login(myUser);
        System.out.println("login = " + login);

        if (login.size() > 0) {
            System.out.println("session = " + session);
            session.setAttribute("userLogin", login.get(0));
            System.out.println("session after set = " + session);
            System.out.println("session get = " + session.getAttribute("userLogin"));
            return "redirect:/card/allcards";
        } else {
            return "error";
        }
    }

    @Override
    public String password(MyUser myUser, Model model, HttpSession session) {
        Integer password = userMapper.password(myUser);
        if (password > 0) {
            return "redirect:/user/tologin";
        } else {
            return "error";
        }
    }

    @Override
    public String toPassword(MyUser myUser, Model model, HttpSession session) {
        model.addAttribute("user", myUser);
        return "password";
    }

    @Override
    public List<MyUser> selectAllUser() {
        List<MyUser> myUsers = userMapper.selectAllUser();
        return myUsers;
    }
}
