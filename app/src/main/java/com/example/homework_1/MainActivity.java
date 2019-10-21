package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> user = new HashMap<>();
                user.put("user@gmail.com", "123");
                email = findViewById(R.id.EditText_Email);
                password = findViewById(R.id.EditText_Password);

                if (user.get(email.getText().toString()) != null &&
                    user.get(email.getText().toString()).equals(password.getText().toString())){
                    Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
