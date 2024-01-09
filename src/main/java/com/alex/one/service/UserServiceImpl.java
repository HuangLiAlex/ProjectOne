package com.alex.one.service;

import com.alex.one.domain.User;
import com.alex.one.domain.UserRepository;
import com.alex.one.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + id));
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + user.getId()));

        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());

        return userRepository.save(existingUser);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
