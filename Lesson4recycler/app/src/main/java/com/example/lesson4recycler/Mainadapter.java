package com.example.lesson4recycler;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Mainadapter extends RecyclerView.Adapter<MainViewHolder> {

    private List<String > list;
    private Context context;

    public Mainadapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.recycler_view,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(list.get(position));
        Log.d("Adapter","onBintViewHolder" + position );
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
    class MainViewHolder extends RecyclerView.ViewHolder{

    TextView textView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            Log.d("Adapter","onBintViewHolder");

            textView = itemView.findViewById(R.id.txtView);

        }
    }
