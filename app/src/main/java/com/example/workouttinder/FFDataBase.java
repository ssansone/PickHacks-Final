package com.example.workouttinder;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.firebase.database.*;

public class FFDataBase {
    final DatabaseReference userRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://workouttinder.firebaseio.com/");
// ...

    public FFDataBase(){
        userRef.orderByChild("height").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String prevChildKey) {
                User user = dataSnapshot.getValue(User.class);
                System.out.println(dataSnapshot.getKey() + " was " + user.getId() + ".");
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String prevChildKey) {
                User user = dataSnapshot.getValue(User.class);
                System.out.println(dataSnapshot.getKey() + " was " + user.getId() + ".");
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
            // ...
        });
    }





}

