package com.example.workouttinder;
import com.google.firebase.database.*;

public class User {
    private int id;

    public User(){
        id = -1;
    }

    public User(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

}

