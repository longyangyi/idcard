package dao;

import model.MyUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public Integer register(MyUser myUser);
    public List<MyUser> login(MyUser myUser);
    public Integer password(MyUser myUser);
    public MyUser selectUserById(Integer id);
    public List<MyUser> selectUserByUname(String uname);
    public List<MyUser> selectAllUser();
}
