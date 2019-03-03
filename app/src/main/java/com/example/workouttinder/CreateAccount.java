package com.example.workouttinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_create_account);
//
//        Button b3;
//        EditText ed3, ed4, ed5, ed6, ed7;
        // TextView tx1;
//    int counter = 3;
 //   }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_create_account);
            Button b3;
            EditText ed3, ed4, ed5, ed6, ed7;

            ed3 = (EditText)findViewById(R.id.editText);
            ed4 = (EditText)findViewById(R.id.editText2);
            ed5 = (EditText)findViewById(R.id.editText2);
            ed6 = (EditText)findViewById(R.id.editText2);

//            b3 = (Button)findViewById(R.id.button2);
//        tx1 = (TextView)findViewById(R.id.textView3);
//        tx1.setVisibility(View.GONE);

//            b3.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    EditText etUserName = (EditText) findViewById(R.id.editText);
//                    String strUserName = etUserName.getText().toString();

//                    if(TextUtils.isEmpty(strUserName)) {
//                        etUserName.setError("The item name cannot be empty.");
//                        return;
//                    }
//                    if(strUserName.isEmpty()) {
//                        etUserName.setError("The item name cannot be empty.");
//                        return;
//                    }

//                    if (ed1.getText().toString().equals("admin") &&
//                            ed2.getText().toString().equals("admin")) {
//                        Toast.makeText(getApplicationContext(),
//                                "Redirecting...", Toast.LENGTH_SHORT).show();
//                    }
//                    else {
//                        Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
//
//
//                    }
//                }
//           });
       }

    }