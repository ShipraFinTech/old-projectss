package com.org.service;

import com.org.beans.User;
import com.org.classes.UserCommand;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    private SessionFactory sessionFactory;

    @Autowired
    public UserService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }


    public int create(UserCommand userCommand) {
        System.out.print("==============USER COMMAND=====" + userCommand.getUsername());
        User user = new User(userCommand);
        getSession().save(user);
        getSession().close();
        return user.getId();
    }
}
