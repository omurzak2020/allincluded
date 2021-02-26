package com.example.additional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String title;
    private String desc;
    private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentView = findViewById(r.id.fragment_second);
        if (fragmentView != null){
            mViewFragment = true;
        }

        Intent intent = getIntent();
        if (intent !=null){
            title = intent.getStringExtra(AppCompatActivity.KEY1);
            desc = intent.getStringExtra(AppCompatActivity.KEY2);
            image = intent.getIntExtra(AppCompatActivity.KEY3,0);

            fragmentManager =getSupportFragmentManager();
            transaction = fragmentManager.beginTransaction();
            transaction.Add(R.id.fragment_first, ChangeFragment.newInstance(title,desc,image));
            transaction.commit();
        }
    }
    public void displayDetails(String title,String description){
        String desc = "A Fragments a behavior or a portion A fragment...";
        if (mViewFragment){
            fragmentManager = getSupportFragmentManager();
            transaction =fragmentManager.beginTransaction();
            transaction.replace(R.id.fragment_second, textFragment.newInstance(title , description));

        }
    }
}