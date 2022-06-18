package service;

import model.MyUser;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {

    String register(MyUser myUser);
    String login(MyUser myUser, Model model, HttpSession session);
    String password(MyUser myUser, Model model, HttpSession session);
    String toPassword(MyUser myUser, Model model, HttpSession session);
    List<MyUser> selectAllUser();

}
