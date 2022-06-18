package controller;

import model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/register")
    public String register(String uname, String upwd) {
        System.out.println("get a request: register");
        MyUser myUser = new MyUser();
        myUser.setUname(uname);
        myUser.setUpwd(upwd);

        String register = userService.register(myUser);
        return register;
    }

    @RequestMapping("/tologin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(String uname, String upwd, Model model, HttpSession session) {
        System.out.println("get a request: login");
        MyUser myUser = new MyUser();
        myUser.setUname(uname);
        myUser.setUpwd(upwd);
        String login = userService.login(myUser, model, session);
        return login;
    }

    @RequestMapping("/topassword")
    public String password(Model model, HttpSession session) {
        MyUser myUser = (MyUser) session.getAttribute("userLogin");
        return userService.toPassword(myUser, model, session);
    }

    @RequestMapping("/password")
    public String password(String upwd, Model model, HttpSession session) {
        MyUser myUser = (MyUser) session.getAttribute("userLogin");
        myUser.setUpwd(upwd);
        return userService.password(myUser, model, session);
    }


    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        System.out.println("get a request: test");


        return "register";
    }

    @RequestMapping("/alluser")
    @ResponseBody
    public String allUser() {
        System.out.println("get a request: alluser");
        List<MyUser> myUsers = userService.selectAllUser();
        for (MyUser myUser : myUsers) {
            System.out.println(myUser);
        }
        return "ok";
    }
}












