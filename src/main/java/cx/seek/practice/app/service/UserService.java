package cx.seek.practice.app.service;

import cx.seek.practice.app.entity.User;
import cx.seek.practice.app.manager.UserManager;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserManager userManager;

    public User findOne(int id) {
        return userManager.findOne(id);
    }
    public List<User> findAll() {
        return userManager.findAll();
    }

}
