package com.alex.one.service;

import com.alex.one.domain.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    Iterable<User> getAllUsers();
    User updateUser(User user);
    void deleteUserById(Long id);
}
