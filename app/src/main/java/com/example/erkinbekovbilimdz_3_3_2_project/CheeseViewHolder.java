package com.example.erkinbekovbilimdz_3_3_2_project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CheeseViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCheese;

    public CheeseViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCheese = itemView.findViewById(R.id.tv_cheese);
    }

    void bind(String cheese){
        tvCheese.setText(cheese);
    }
}
