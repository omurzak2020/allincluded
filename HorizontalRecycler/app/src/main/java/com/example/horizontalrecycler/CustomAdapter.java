package com.example.horizontalrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private Context context;
    private ArrayList<HackSmileModel> items;

    public CustomAdapter(Context context, ArrayList<HackSmileModel> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate());
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
