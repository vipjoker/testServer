package com.example.repository;

import com.example.model.ActivityModel;
import com.example.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

/**
 * Created by Makhobey Oleh on 9/3/15.
 * emai: tajcig@ya.ru
 */

@Path("user")
public class ActivityController {
    ActivityResourceStub activityResource = new ActivityResourceStub();

    @GET
    public String getActivities(@PathParam("user") String user) {
        return "Works" + user;
    }




}

