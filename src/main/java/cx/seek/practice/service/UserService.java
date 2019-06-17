package cx.seek.practice.service;

import cx.seek.practice.entity.User;
import cx.seek.practice.manager.UserManager;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

    @Autowired
    private UserManager userManager;

    public User findOne(int id) {
        return userManager.findOne(id);
    }
}
