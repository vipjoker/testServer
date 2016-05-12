package com.example;

import com.example.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 23.01.2016.
 */


@Path("user")
public class UserController {

    @GET
    @Produces("application/json")
    public List<User> getUsers(){

        List<User> userList = new ArrayList<>();
        userList.addAll(Arrays.asList(
                new User("Ivan","Ivanov" ,1),
                new User("Ivan","Ivanov" ,2),
                new User("Ivan","Ivanov" ,3),
                new User("Ivan","Ivanov" ,4),
                new User("Ivan","Ivanov" ,5)
                ));
//https://xakep.ru/category/linuxoid/
        return userList;
    }
}
