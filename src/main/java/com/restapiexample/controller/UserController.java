package com.restapiexample.controller;

import com.restapiexample.model.User;
import com.restapiexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // retrieve all student from database
    @GetMapping("get")
    public List<User> getAllUser() {
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }

    // insert new student into database
    @PostMapping("adduser")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // get particular student by their ID
    @GetMapping("user/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return userRepository.findById(id);
    }


    // update existing user
    @PutMapping("update/{id}")
    public User upadteUserInfo(@RequestBody User user) {
        return userRepository.save(user);
    }

    //delete existing user
    @DeleteMapping("delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userRepository.deleteById(id);
        return "User deleted successfully";
    }
}
