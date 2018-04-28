/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.francisco.rest.repository;

import com.francisco.rest.data.User;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author jhovy
 */

public interface UserRepository extends CrudRepository<User, Integer>{
    
}
