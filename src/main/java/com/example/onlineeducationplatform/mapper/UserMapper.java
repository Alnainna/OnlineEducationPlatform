package com.example.onlineeducationplatform.mapper;

import com.example.onlineeducationplatform.entity.User;
import java.util.List;

public interface UserMapper {
    void insertUser(User user);
    List<User> selectAllUsers();
    User selectUserById(Integer id);
    User selectUserByUsername(String username);
    void updateUser(User user);
    void deleteUserById(Integer id);
    int countUsers();
}
