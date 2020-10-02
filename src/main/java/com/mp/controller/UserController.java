package com.mp.controller;

import com.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "api/user")
public class UserController {
    //C-Post
    //R-Get
    //U-Post,Put,Patch
    //D-Delete


    @Autowired
    private UserService userService;

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public ResponseEntity<?>register(@Valid ResponseBody User user ){
        userService.save(user);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }
}
