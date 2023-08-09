package com.example.java_gevorderd.message;

import com.example.java_gevorderd.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "Message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String message_text;
    String creation_timestamp;

    @OneToOne
    User user;

    public long getId() {
        return id;
    }

    public String getMessage_text() {
        return message_text;
    }

    public void setMessage_text(String message_text) {
        this.message_text = message_text;
    }

    public String getCreation_timestamp() {
        return creation_timestamp;
    }

    public void setCreation_timestamp(String creation_timestamp) {
        this.creation_timestamp = creation_timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Message(){}

    public Message(String message_text,
                   String creation_timestamp,
                   User user){
        this.message_text = message_text;
        this.creation_timestamp = creation_timestamp;
        this.user = user;
    }
}
