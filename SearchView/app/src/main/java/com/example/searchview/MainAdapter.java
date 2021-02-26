package com.example.searchview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Locale;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> implements Filterable {

    List<TitleModel> list;
    Context context;

    public MainAdapter(List<TitleModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public void addAplication(TitleModel titleModel){
        list.add(titleModel);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_recycler_view,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public Filter getFilter() {
        return null;
    }


    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle;
        TitleModel titleModel;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.title);
        }
        public void onBind(TitleModel model){
            this.titleModel = model;
            txtTitle.setText(model.title);
        }
    }

}
