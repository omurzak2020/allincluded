package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.progress_me);
        button2 = findViewById(R.id.costom_dialog);
        button3 = findViewById(R.id.prog_gialog);
        button4 = findViewById(R.id.horizontall);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog dialog = new ProgressDialog(MainActivity.this);
                dialog.setTitle("iJ AppS");
                dialog.setMessage("Loading Video...");
                dialog.setIndeterminate(false);
                dialog.setCancelable(true);
                dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);

                 dialog.show();

                final int[] progress = {0};
                dialog.setProgress(progress[0]);

                new CountDownTimer(5000,50) {
                    @Override
                    public void onTick(long l) {
                        progress[0]++;
                        dialog.setProgress(progress[0]);
                    }

                    @Override
                    public void onFinish() {

                    }
                }.start();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog dialog = new ProgressDialog(MainActivity.this);
                dialog.setTitle("iJ AppS");
                dialog.setMessage("Loading Video...");
                dialog.setIndeterminate(true);
                dialog.setCancelable(true);
                dialog.show();
            }
        });
    }

}