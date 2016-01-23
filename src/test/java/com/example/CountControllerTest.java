package com.example;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.GenericType;

import com.example.model.User;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CountControllerTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(CountController.class,UserController.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() {
        final String responseMsg = target().path("myresource").request().get(String.class);

        assertEquals("Hello, Heroku!", responseMsg);
    }

    @Test
    public void testPostIt(){
      final List<User> users   =  target()
               .path("user")
               .request()
               .get(new GenericType<List<User>>(){});

        assertEquals(users.size(),5);

    }
}
