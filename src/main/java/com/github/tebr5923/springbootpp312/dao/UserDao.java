package com.github.tebr5923.springbootpp312.dao;

import com.github.tebr5923.springbootpp312.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();
}
