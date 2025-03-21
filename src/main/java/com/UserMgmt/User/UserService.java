package com.UserMgmt.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public user saveUser(user user) {
        return userRepository.save(user);
    }

    public user getUser(String uid) {
        return userRepository.findById(uid).orElse(null);
    }
}
