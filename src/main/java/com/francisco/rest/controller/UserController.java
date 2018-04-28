/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francisco.rest.controller;

import com.francisco.rest.service.UserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jhovy
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    
    @Autowired
    private UserService userservice;
    
    @GetMapping("/getUsers")
    public Map<String,Object> getUsers(){
        Map<String,Object> users = userservice.getUsers();
        return users;
        
    }
}
