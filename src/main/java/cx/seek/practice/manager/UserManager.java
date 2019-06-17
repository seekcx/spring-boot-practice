package cx.seek.practice.manager;

import cx.seek.practice.entity.User;
import cx.seek.practice.mapper.UserMapper;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(readOnly = true)
public class UserManager {

    @Autowired
    private UserMapper userMapper;

    public User findOne(int id) {
        return userMapper.findOne(id);
    }
}
