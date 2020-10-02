package com.mp.service;

import com.mp.domain.User;
import com.mp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getById(long id){
        return userRepo.getById((long) id);
    }

    public User getByUsername(String username){
        return userRepo.getByUsername(username);
    }


}
