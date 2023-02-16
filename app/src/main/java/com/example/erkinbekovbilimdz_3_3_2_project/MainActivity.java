package com.example.erkinbekovbilimdz_3_3_2_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ArrayList<String> cheeseList;

    private CheeseAdapter adapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_cheese);

        loadData();
        adapter = new CheeseAdapter(cheeseList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        cheeseList = new ArrayList<>();
        cheeseList.add("Адыгейский");
        cheeseList.add("Альметте");
        cheeseList.add("Аперифрэ");
        cheeseList.add("Жерве");
        cheeseList.add("Маскарпоне");
        cheeseList.add("Моцарелла");
        cheeseList.add("Рикотта");
        cheeseList.add("Тофу");
        cheeseList.add("Филадельфия");
        cheeseList.add("Чеддер");
        cheeseList.add("Гауда");
    }
}