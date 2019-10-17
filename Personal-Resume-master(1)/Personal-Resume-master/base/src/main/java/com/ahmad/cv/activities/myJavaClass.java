package com.ahmad.cv.activities;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.adapters.MyAdapter;
import com.ahmad.cv.base.R;
import com.ahmad.cv.model.Data;

public class myJavaClass extends AppCompatActivity {

    MyAdapter adapter;
    RecyclerView x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_blank);

        adapter = new MyAdapter(this, Data.getdata());

        x = findViewById(R.id.recyclerViewDemo3);

        x.setLayoutManager(new LinearLayoutManager(this));
        x.setAdapter(adapter);
    }
    }