package cx.seek.practice.app.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import cx.seek.practice.app.entity.User;
import io.swagger.annotations.ApiOperation;
import cx.seek.practice.app.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Api(tags = "用户")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ApiOperation("用户列表")
    public IPage<User> index(@RequestParam(value = "page", defaultValue = "1") int page,
                             @RequestParam(value = "size", defaultValue = "10") int size) {
        Page<User> pageable = new Page<>(page, size);
        pageable.setDesc("id");
        return userService.findAll(pageable);
    }

    @GetMapping("/{id}")
    @ApiOperation("用户详情")
    public User user(@PathVariable("id") int id) {
        return userService.findOne(id);
    }
}

