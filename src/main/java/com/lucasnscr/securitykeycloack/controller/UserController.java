package com.lucasnscr.securitykeycloack.controller;

import com.lucasnscr.securitykeycloack.model.User;
import com.lucasnscr.securitykeycloack.service.UserService;
import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }

    @PostMapping("save")
    public Long saveUser(@RequestBody User user){
        log.info("Request for user");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public User saveUser(@PathVariable @NotNull Long id ){
        log.info("Request for user " + id + " received");
        return userService.getUserById(id);
    }

}
