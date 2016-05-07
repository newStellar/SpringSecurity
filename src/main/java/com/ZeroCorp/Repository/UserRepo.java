package com.ZeroCorp.Repository;

import com.ZeroCorp.Models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 * Created by Nahid on 5/7/2016.
 */
@Repository
public interface UserRepo extends JpaRepository<UserInfo,Long>{

}
