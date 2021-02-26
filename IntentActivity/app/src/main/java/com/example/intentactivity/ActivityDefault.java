package com.example.intentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ActivityDefault extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.fromParts("sms","0505071100",null));
        intent.putExtra("sms_body","Hello how are you?");
        startActivity(intent);
    }

    public void openWePage(View view) {
        Uri webPage = Uri.parse("https:instagram.ru");
        Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

    public void showMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:34.4, -34.6"));
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }
}