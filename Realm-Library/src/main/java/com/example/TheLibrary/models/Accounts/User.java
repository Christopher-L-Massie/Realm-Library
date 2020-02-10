package com.example.TheLibrary.models.Accounts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class User {

    //|||PROPERTIES|||

    @Id
    @GeneratedValue
    int id;

    private String userName;

    private String password;

    private Timestamp timeCreated = new Timestamp(System.currentTimeMillis());

    //|||CONSTRUCTORS|||

    //empty for database setup
    public User(){}

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    //|||METHODS|||

    //|||ACCESSORS|||

    public String getUserName() {
        return userName;
    }
    
}
