package com.restapiexample.model;

import jakarta.persistence.*;


@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String user_Name;
    private String user_Lastname;
    private String email_Id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getUser_Lastname() {
        return user_Lastname;
    }

    public void setUser_Lastname(String user_Lastname) {
        this.user_Lastname = user_Lastname;
    }

    public String getEmail_Id() {
        return email_Id;
    }

    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;
    }

    public User(String user_Name, String user_Lastname, String email_Id) {
        this.user_Name = user_Name;
        this.user_Lastname = user_Lastname;
        this.email_Id = email_Id;
    }

    public User() {
    }
}
