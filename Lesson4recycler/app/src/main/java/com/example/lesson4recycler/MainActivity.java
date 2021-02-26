package com.example.lesson4recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    private Mainadapter mainadapter;
    public List<String > list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();

            list.add("1 А");
            list.add("1 B");
            list.add("1 C");
            list.add("1 ");
            list.add("1 А");
            list.add("1 А");
            list.add("1 А");
            list.add("1 А");


        mainadapter =new Mainadapter(list,this);
        recyclerView.setAdapter(mainadapter);
    }
}