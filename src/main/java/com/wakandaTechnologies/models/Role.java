package com.wakandaTechnologies.models;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {

    //Primary Key
    @Id
    private String name;

    //Entity relationship
    @ManyToMany(mappedBy = "roles")
    private List<User> users;


    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Role(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    //Default Constructor

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

}


