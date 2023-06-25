package com.m4xvel.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class authorization extends AppCompatActivity {

    private Button button_log_auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authorization);

        button_log_auth = findViewById(R.id.button_log_auth);

        button_log_auth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(authorization.this, registration.class);
                startActivity(intent);
                closeActivity();
            }
        });
    }
    private void closeActivity() {
        this.finish();
    }
}