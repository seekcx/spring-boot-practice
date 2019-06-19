package cx.seek.practice.app.controller;

import io.swagger.annotations.Api;
import cx.seek.practice.app.entity.User;
import io.swagger.annotations.ApiOperation;
import cx.seek.practice.app.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Api(tags = "用户")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ApiOperation("用户列表")
    public Page<User> index(@PageableDefault() Pageable pageable) {
        return userService.list(pageable);
    }

    @GetMapping("/{id}")
    @ApiOperation("用户详情")
    public User user(@PathVariable("id") long id) {
        return userService.detail(id);
    }
}
