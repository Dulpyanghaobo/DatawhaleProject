package cn.datawhale.app.xyz.Service;

import cn.datawhale.app.xyz.DAO.UserDao;
import cn.datawhale.app.xyz.PoJo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }
    // 增加标签
    public void add(User user) {
        userDao.save(user);
    }
}
