package com.example.recyclerviewfruit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.appele);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.banana);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.xigua);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.pear);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.boluo);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.caomei);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.cherry);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.manglo);
            fruitList.add(mango);
        }
    }
}