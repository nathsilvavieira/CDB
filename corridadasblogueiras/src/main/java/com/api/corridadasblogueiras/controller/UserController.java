package com.api.corridadasblogueiras.controller;

import com.api.corridadasblogueiras.model.UserModel;
import com.api.corridadasblogueiras.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="corridadasblogueiras/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    List<UserModel> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<UserModel> findUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @PostMapping("/save")
    public UserModel saveUserModel(@RequestBody UserModel user){
        return userService.saveUserModel(user);
    }

    @PutMapping("/update")
    public UserModel updateUserModel(@RequestBody UserModel user){
        return userService.saveUserModel(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}
