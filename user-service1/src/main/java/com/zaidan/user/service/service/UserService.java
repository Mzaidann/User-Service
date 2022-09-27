/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zaidan.user.service.service;

import java.util.List;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

/**
 *
 * @author HP
 */
public interface UserService {
    public List<User> getalluser();

    public User getUser(String id);

    public void addUser(User user); 
    
    public User updateUser(User user);

    public User deleteUser(String id);

    public List<SecurityProperties.User> getAllUsers();  

    public void addUser(com.zaidan.user.service.dto.User user);

    public com.zaidan.user.service.dto.User updateUser(com.zaidan.user.service.dto.User user);
}
