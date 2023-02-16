package com.example.erkinbekovbilimdz_3_3_2_project;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CheeseAdapter extends RecyclerView.Adapter<CheeseViewHolder> {

    private ArrayList<String> cheeseList;

    public CheeseAdapter(ArrayList<String> cheeseList) {
        this.cheeseList = cheeseList;
    }

    @NonNull
    @Override
    public CheeseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CheeseViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cheese, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CheeseViewHolder holder, int position) {
        holder.bind(cheeseList.get(position));
    }

    @Override
    public int getItemCount() {
        return cheeseList.size();
    }
}
