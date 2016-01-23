package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Admin on 23.01.2016.
 */


@XmlRootElement
public class User {
    private String name;
    private String surname;
    private long id;

    public User(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public User(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
