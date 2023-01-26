package com.example.mesteccomerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mesteccomerce.adapter.HomeFeedAdapter;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerViewHomeFeed = findViewById(R.id.recyclerViewHomeFeed);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Home.this,LinearLayoutManager.VERTICAL,false);
        recyclerViewHomeFeed.setLayoutManager(linearLayoutManager);

        List<String> data = new ArrayList<>();
        data.add("hello");
        data.add("hello");
        data.add("hello");
        data.add("hello");
        data.add("hello");
        data.add("hello");
        HomeFeedAdapter homeFeedAdapter = new HomeFeedAdapter(Home.this,data);
        recyclerViewHomeFeed.setAdapter(homeFeedAdapter);
    }



}