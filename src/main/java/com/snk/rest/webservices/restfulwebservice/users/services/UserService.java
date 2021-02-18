package com.snk.rest.webservices.restfulwebservice.users.services;

import com.snk.rest.webservices.restfulwebservice.users.dao.UserDAO;
import com.snk.rest.webservices.restfulwebservice.users.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;


    public List<User> getUserList(){
        return userDAO.getUserList();
    }


    public User findOne(Long id){
        return userDAO.findOne(id);
    }


    public User saveUser(User user){
        return userDAO.saveUser(user);
    }

    public User deleteUser(Long id) {
        return userDAO.deleteUser(id);

    }


}
