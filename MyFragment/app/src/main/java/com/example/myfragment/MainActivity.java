package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IFragment{

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSendMessage(String message) {
        fragmentManager = getSupportFragmentManager();
        TextFragment fragment = (TextFragment) fragmentManager.findFragmentById(R.id.fragmet_second);
        fragment.showText(message);
        transaction = fragmentManager.beginTransaction();
        transaction.commit();
    }
 
    @Override
    public void onReplace() {
        ChangeFragment fragment = new ChangeFragment();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}