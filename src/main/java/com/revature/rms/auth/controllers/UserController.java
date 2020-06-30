package com.revature.rms.auth.controllers;

import com.revature.rms.auth.documents.AppUser;
import com.revature.rms.auth.services.UserService;
import com.revature.rms.core.controllers.ResourceController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController extends ResourceController<AppUser> {

    private UserService userService;

    public UserController(UserService service) {
        super(service);
        this.userService = service;
    }
}
