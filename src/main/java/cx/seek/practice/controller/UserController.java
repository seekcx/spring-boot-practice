package cx.seek.practice.controller;

import com.github.pagehelper.PageHelper;
import cx.seek.practice.entity.User;
import cx.seek.practice.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> index(@RequestParam(value = "page", defaultValue = "1") int page,
                            @RequestParam(value = "size", defaultValue = "10") int size) {
        PageHelper.startPage(page, size);
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User user(@PathVariable("id") int id) {
        return userService.findOne(id);
    }
}
