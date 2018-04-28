/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francisco.rest.service;

import com.francisco.rest.data.User;
import com.francisco.rest.repository.UserRepository;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jhovy
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    public Map<String, Object> getUsers() {
        Iterable<User> users = userRepository.findAll();
        Map<String,Object> obj = new HashMap<>();
        obj.put("Users", users);
        return obj;
    }
    
}
