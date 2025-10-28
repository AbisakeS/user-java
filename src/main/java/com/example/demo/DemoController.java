package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DemoController {

    private List<User> users = new ArrayList<>();

    @GetMapping("/api/users")
    public List<User> getUsers() {
        return users;
    }

    @PostMapping("/api/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        users.add(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PutMapping("/api/users/{id}")
    public User putMethodName(@PathVariable String id, @RequestBody User paramUser) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setName(paramUser.getName());
                user.setShortName(paramUser.getShortName());
                user.setId(id);

            }
            return user;
        }
        return null;
    }

    @DeleteMapping("/api/users/{id}")
    public String deleteUser(@PathVariable String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);
            }
            return "User Deleted";
        }
        return null;
    }

}
