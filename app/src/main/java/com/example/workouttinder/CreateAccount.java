package com.example.workouttinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_create_account);
            Button b3 = (Button)findViewById(R.id.button4);


        b3.setOnClickListener(new View.OnClickListener() {


        @Override
        public void onClick(View v) {

            EditText ed3 = (EditText) findViewById(R.id.ed3);
            EditText ed4 = (EditText) findViewById(R.id.ed4);
            EditText ed5 = (EditText) findViewById(R.id.ed5);
            EditText ed6 = (EditText) findViewById(R.id.ed6);

            if ((ed3.getText() != null && ed3.getText().length() > 0) && (ed4.getText() != null && ed4.getText().length() > 0) && (ed5.getText() != null && ed5.getText().length() > 0) && (ed6.getText() != null && ed6.getText().length() > 0)){

                Intent intent = new Intent(CreateAccount.this, Match.class);
                startActivity(intent);

            }

            else{
                System.out.println("HEY BRO");
            }


        }});
       }


        }

