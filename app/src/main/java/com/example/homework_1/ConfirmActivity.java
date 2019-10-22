package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {

    private TextView email;
    private TextView password;
    private Button btnConfirm;
    private EditText messageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        Intent intent = getIntent();
        String emailIntent = intent.getStringExtra("ma_email");
        String passwordIntent = intent.getStringExtra("ma_password");

        email = findViewById(R.id.Ca_TextView_Email);
        password = findViewById(R.id.Ca_TextView_Password);

        email.setText(emailIntent);
        password.setText(passwordIntent);

        btnConfirm = findViewById(R.id.Ca_btn_confirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageBack = findViewById(R.id.Ca_input_something);
                Intent intent1 = new Intent(ConfirmActivity.this, MainActivity.class);
                intent1.putExtra("ca_message", messageBack.getText().toString());
                startActivity(intent1);
            }
        });


    }
}
