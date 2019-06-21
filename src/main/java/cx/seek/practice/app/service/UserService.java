package cx.seek.practice.app.service;

import cx.seek.practice.app.entity.User;
import cx.seek.practice.app.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findOne(int id) {
        return userMapper.selectById(id);
    }

    public IPage<User> findAll(Page<User> pageable) {
        return userMapper.selectPage(pageable, null);
    }
}
