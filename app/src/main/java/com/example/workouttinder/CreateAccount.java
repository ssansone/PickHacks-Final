package com.example.workouttinder;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class CreateAccount extends AppCompatActivity {
    private static final String TAG = "EmailPassword";

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
        private   FirebaseAuth mAuth;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

// ...
// Initialize Firebase Auth

            setContentView(R.layout.activity_create_account);
            Button b3;
            EditText ed3, ed4, ed5, ed6, ed7;

            ed3 = (EditText)findViewById(R.id.editText);
            ed4 = (EditText)findViewById(R.id.editText2);
            ed5 = (EditText)findViewById(R.id.editText2);
            ed6 = (EditText)findViewById(R.id.editText2);
            String email=ed4.getText().toString();
            String password=ed6.getText().toString();

            mAuth = FirebaseAuth.getInstance();

            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                Log.d(TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                            } else {
                                // If sign in fails, display a message to the user.
                                Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(CreateAccount.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                            }

                            // ...
                        }
                    });

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