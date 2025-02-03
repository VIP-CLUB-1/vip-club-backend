package com.wthallys.vip_club.controller;

import com.wthallys.vip_club.model.UserVip;
import com.wthallys.vip_club.service.UserVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserVipController {
    @Autowired
    private UserVipService service;

    @PostMapping
    @RequestMapping("/register")
    public ResponseEntity<Void> saveUser(@RequestBody UserVip userVip) {
        service.saveUser(userVip);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
