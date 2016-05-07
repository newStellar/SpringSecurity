package com.ZeroCorp.Models;

import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Created by Nahid on 5/7/2016.
 */
public class CurrentUser extends org.springframework.security.core.userdetails.User{


    private UserInfo userInfo;

    public CurrentUser(UserInfo userInfo){

        super(userInfo.getName(),userInfo.getPassword(), AuthorityUtils.createAuthorityList("USER"));
        this.userInfo =userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
