package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        Intent intent1 = getIntent();
        if (intent1.getStringExtra("ca_message") != null) {
            Toast.makeText(getApplicationContext(),intent1.getStringExtra("ca_message"), Toast.LENGTH_SHORT).show();
        }


        btnLogin = findViewById(R.id.Ma_btn_rigister);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> user = new HashMap<>();
                user.put("user@gmail.com", "123");
                email = findViewById(R.id.Ma_EditText_Email);
                password = findViewById(R.id.Ma_EditText_Password);

                Intent intent = new Intent(MainActivity.this, ConfirmActivity.class);
                intent.putExtra("ma_email", email.getText().toString());
                intent.putExtra("ma_password", password.getText().toString());
                startActivity(intent);

            }
        });

    }
}
