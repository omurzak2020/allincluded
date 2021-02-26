package com.example.tutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.text_View);
        seekBar = findViewById(R.id.idIdeekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String text = textView.getText().toString();
                textView.setText();
                //text.codePointAt(progress);
                //textView.setText(progress);
                //textView.getText().toString();
                //textView.setText(progress);
                Toast.makeText(getApplicationContext(),"SeekBar Progress: "+progress, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"SeekBar Touch Started ", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"SeekBar Touch Started ", Toast.LENGTH_LONG).show();
            }
        });
    }
}