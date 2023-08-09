package com.example.java_gevorderd.chatroom;

import com.example.java_gevorderd.message.Message;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "Chatroom")
public class Chatroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String room_name;
    String creation_timestamp;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "messages")
    private List<Message> messages;

    public long getId() {
        return id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getCreation_timestamp() {
        return creation_timestamp;
    }

    public void setCreation_timestamp(String creation_timestamp) {
        this.creation_timestamp = creation_timestamp;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Chatroom(){}

    public Chatroom(String room_name,
                    String creation_timestamp,
                    List<Message> messages){
        this.room_name = room_name;
        this.creation_timestamp = creation_timestamp;
        this.messages = messages;
    }
}
