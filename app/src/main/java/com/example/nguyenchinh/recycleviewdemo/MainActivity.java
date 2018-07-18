package com.example.nguyenchinh.recycleviewdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRcvAdapter;
    List<String> heroNames = new ArrayList<>();
    List<Integer> heroImages = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        File folder = new File("drawable");

        heroNames.add("aquaman");
        heroImages.add(R.drawable.aquaman);
        heroNames.add("batman");
        heroImages.add(R.drawable.batman);
        heroNames.add("superman");
        heroImages.add(R.drawable.superman);
        heroNames.add("wonder woman");
        heroImages.add(R.drawable.wonder_worman);
        heroNames.add("flash");
        heroImages.add(R.drawable.flash);
        heroNames.add("green lartern");
        heroImages.add(R.drawable.green_latern);
        heroNames.add("cyborg");
        heroImages.add(R.drawable.cyborg);
        heroNames.add("captain america");
        heroImages.add(R.drawable.captain_america);
        heroNames.add("spider man");
        heroImages.add(R.drawable.spider_man);
        mRcvAdapter = new RecyclerViewAdapter(heroNames, heroImages);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRcvAdapter);
    }
}
