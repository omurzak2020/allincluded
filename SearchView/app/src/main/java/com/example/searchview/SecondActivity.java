package com.example.searchview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    public static final String KEY = "key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = findViewById(R.id.edit_Text);
        button = findViewById(R.id.bottom2);

        init();

    }

    private void init() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();

                Intent intent = new Intent();

                TitleModel model = new TitleModel();

                model.setTitle(text);

                intent.putExtra(KEY,model);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}