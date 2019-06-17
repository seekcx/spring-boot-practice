package cx.seek.practice.app.manager;

import cx.seek.practice.app.entity.User;
import cx.seek.practice.app.mapper.UserMapper;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional(readOnly = true)
public class UserManager {

    @Autowired
    private UserMapper userMapper;

    public User findOne(int id) {
        return userMapper.findOne(id);
    }

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
