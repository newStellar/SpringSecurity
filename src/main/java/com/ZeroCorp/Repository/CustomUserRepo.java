package com.ZeroCorp.Repository;

import com.ZeroCorp.Models.UserInfo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Nahid on 5/7/2016.
 */

@Repository
public class CustomUserRepo {

    @Autowired
    private SessionFactory sf;

    public UserInfo getUserByName(String name){

        Session session = sf.openSession();

        session.beginTransaction();
        Criteria criteria = session.createCriteria(UserInfo.class);

        criteria.add(Restrictions.eq("name",name));

        List<UserInfo> users = (List<UserInfo>)criteria.list();

        session.getTransaction().commit();
        session.close();

        return users.get(0);

    }

    public void createUser(UserInfo userDetails){

        Session session = sf.openSession();
        session.beginTransaction();

        session.save(userDetails);

        session.getTransaction().commit();
        session.close();
    }

}
