package com.apmoller.gradleapplication.demo.controller;

import com.apmoller.gradleapplication.demo.utility.UserList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    List<String> userList = new ArrayList<>();

    UserList userlist;

    @GetMapping("/users")
    public ResponseEntity<List<String>> getAllUsers() {
        try{
            userList= userlist.getDefaultUserList(userList);
            if (userList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(userList, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
