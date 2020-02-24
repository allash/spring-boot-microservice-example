package com.microhome.auth.api;

import com.microhome.auth.api.dto.request.DtoCreateUserRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(@RequestBody @Valid DtoCreateUserRequest body) {
        logger.info("CREATE USER: " + body.getName());
        userService.create(body);
    }

    @GetMapping("/ping")
    public String ping() {
        return "PONG USER";
    }
}
