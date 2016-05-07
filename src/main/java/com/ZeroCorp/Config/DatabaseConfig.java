package com.ZeroCorp.Config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

/**
 * Created by Nahid on 5/7/2016.
 */
@Component
public class DatabaseConfig {

    @Autowired
    private EntityManagerFactory emf;

    @Bean
    public SessionFactory getSessionFactory(){

        return emf.unwrap(SessionFactory.class);
    }
}
