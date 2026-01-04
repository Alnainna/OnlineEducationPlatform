package com.example.onlineeducationplatform.service;

import com.example.onlineeducationplatform.entity.User;
import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    User getUserById(Integer id);
    void updateUser(User user);
    void deleteUser(Integer id);
    int getTotalUserCount();
}
