package com.example.intentactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Button button;
    public static final String INTENT_KEY = "key";
    public static final int REQUEST_SODE = 100;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        button =findViewById(R.id.btnbutton);
        textView =findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra(INTENT_KEY,"Hello from Mainactivity");
                startActivityForResult(intent,REQUEST_SODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_SODE && resultCode == RESULT_OK){
            String text = data.getStringExtra(SecondActivity.RESULT_KEYY);
//           Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
             textView.setText(text);
            Log.d("ruselt",text);
        }
    }
}