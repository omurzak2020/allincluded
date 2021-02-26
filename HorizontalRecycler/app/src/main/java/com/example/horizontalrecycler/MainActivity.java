package com.example.horizontalrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<HackSmileModel> items = new ArrayList<>();
        CustomAdapter adapter = new CustomAdapter(this,items);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recyclerView.setAdapter(adapter);

        for (int i = 0; i < 10; i++) {
            items.add(new HackSmileModel(R.drawable.picture1, "Title" + i));
            adapter.notifyDataSetChanged();
        }
    }
}