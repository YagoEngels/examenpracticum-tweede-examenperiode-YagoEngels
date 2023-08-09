package com.example.java_gevorderd.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "User")
public class User {

    @Id
    @NotNull
    String username;

    String first_name;
    String last_name;
    String email;

    public String getUsername(){ return username;}

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){}

    public User(String username,
                String first_name,
                String last_name,
                String email){
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }
}
