package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;
    String s1[],s2[];
    myownadapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 = findViewById(R.id.myrecycler);
        s1 = getResources().getStringArray(R.array.pet_names);
        s2 = getResources().getStringArray(R.array.description);
        ad = new myownadapter(this,s1,s2);
        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));

    }
}