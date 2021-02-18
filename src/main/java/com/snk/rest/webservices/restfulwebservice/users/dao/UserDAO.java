package com.snk.rest.webservices.restfulwebservice.users.dao;

import com.snk.rest.webservices.restfulwebservice.users.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDAO {


    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User(1L,"krishna",new Date()));
        userList.add(new User(2L,"Radha",new Date()));
        userList.add(new User(3L,"Gopal",new Date()));
        userList.add(new User(4L,"Madhav",new Date()));
    }

    public List<User> getUserList(){
        return userList;
    }


    public User findOne(Long id){


        for(User user : userList){
            if(user.getId().equals(id)){
                return user;
            }
        }

        return null;
    }


    public User saveUser(User user){
        if(userList.add(user)){
            return user;
        }else{
            return null;
        }
    }

    public User deleteUser(Long id) {

        Iterator<User> userIterator = userList.iterator();

        while (userIterator.hasNext()) {
           User user = userIterator.next();
            if(user.getId().equals(id)){
                userIterator.remove();
                return user;
            }

        }

        return null;

    }


}
