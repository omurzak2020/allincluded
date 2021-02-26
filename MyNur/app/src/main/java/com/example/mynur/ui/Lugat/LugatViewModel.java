package com.example.mynur.ui.Lugat;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynur.R;

public class LugatViewModel extends RecyclerView.Adapter<LugatViewModel.holder> {


    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {

    }



    @Override
    public int getItemCount() {
        return 0;
    }

    public class holder extends RecyclerView.ViewHolder {
        public holder(@NonNull View itemView) {
            super(itemView);
        }
    }

}