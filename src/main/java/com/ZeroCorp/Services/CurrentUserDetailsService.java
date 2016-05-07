package com.ZeroCorp.Services;

import com.ZeroCorp.Models.CurrentUser;
import com.ZeroCorp.Models.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Nahid on 5/7/2016.
 */
@Service
public class CurrentUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Autowired
    public CurrentUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    /*
    * Create CurrentUser model first because it extends UserDetails of Spring;
    * */
    @Override
    public CurrentUser loadUserByUsername(String name) throws UsernameNotFoundException {

        UserInfo userInfo = userService.getUserByName(name);
        return new CurrentUser(userInfo);
    }
}
