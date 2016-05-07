package com.ZeroCorp.Services;

import com.ZeroCorp.Models.UserInfo;
import com.ZeroCorp.Repository.CustomUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nahid on 5/7/2016.
 */
@Service
public class UserService {



    @Autowired
    private CustomUserRepo customUserRepo;

    public UserInfo getUserByName(String name){

       return customUserRepo.getUserByName(name);
    }

    public void createUser(String name){

        UserInfo user = new UserInfo();
        user.setName(name);
        user.setEmail(name+"@gmail.com");
        user.setPassword("1234");

        customUserRepo.createUser(user);
    }


}
