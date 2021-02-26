
package com.example.myhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;
    private String Username = "Admin";
    private String Password = "123";
    private ImageView eimageView;
    private ImageView imageView;
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
        eimageView =findViewById(R.id.image_View);
        imageView = findViewById(R.id.imageView);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ePassword.getText().toString();
                eAttemptsInfo.setText(text);
                eimageView.setImageResource(R.drawable.ic_lock_open);
            }
        });

        eLogin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if (inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Пожалуйста, введите все данные правильно!",Toast.LENGTH_SHORT).show();
                }else {

                isValid = validate(inputName,inputPassword);

                if (!isValid){

                    counter --;

                    Toast.makeText(MainActivity.this, "Вы ввели не правильные данные!",Toast.LENGTH_SHORT).show();

                    eAttemptsInfo.setText("Кол-во оставшихся попыток: "+counter);


                    if (counter == 0){
                        eLogin.setEnabled(false);

                    }
                }else {

                    Toast.makeText(MainActivity.this, "\n" + "Авторизация успешна!",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, HomePageActibity.class);
                    startActivity(intent);

                    imageView.setImageResource(R.drawable.ic_lock_open);

                }
                }

            }
        });
    }

    private boolean validate(String name, String  password){
        if (name.equals(Username) && password.equals(Password)){
        return true;
        }
        return false;
    }

}