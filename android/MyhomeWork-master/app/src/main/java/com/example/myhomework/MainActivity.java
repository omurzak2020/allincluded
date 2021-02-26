package com.example.myhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private ImageView imageView;
    private Button eLogin;
    private TextView eAttemptsInfo;
    private String Username = "Admin";
    private String Password = "12345678";

    boolean isValid = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName =findViewById(R.id.etName);
        ePassword =findViewById(R.id.etPassword);
        eLogin =findViewById(R.id.btnLogin);
        eAttemptsInfo =findViewById(R.id.tvAttemltslnof);
        imageView =findViewById(R.id.image_View);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.ic_lock_open);
            }
        });


    }

}

