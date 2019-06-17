package cx.seek.practice.app.controller;

import com.github.pagehelper.PageHelper;
import cx.seek.practice.app.entity.User;
import cx.seek.practice.app.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
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
    public List<User> index(@RequestParam(value = "page", defaultValue = "1") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size) {
        PageHelper.startPage(page, size);
        return userService.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation("用户详情")
    public User user(@PathVariable("id") int id) {
        return userService.findOne(id);
    }
}
