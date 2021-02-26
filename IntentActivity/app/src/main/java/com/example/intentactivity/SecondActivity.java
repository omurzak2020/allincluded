package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button button;
    public static final String RESULT_KEYY = "result_key";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if (intent != null){
            String text = intent.getStringExtra(MainActivity.INTENT_KEY);
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
            setupUI();
        }
    }

    
    private void setupUI() {
        editText = findViewById(R.id.editText);
        button= findViewById(R.id.btnSendResult);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String text = editText.getText().toString();
                intent.putExtra(RESULT_KEYY,text);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}