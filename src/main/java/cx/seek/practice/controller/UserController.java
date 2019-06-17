package cx.seek.practice.controller;

import cx.seek.practice.entity.User;
import cx.seek.practice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User user(@PathVariable("id") int id) {
        return userService.findOne(id);
    }
}
