package com.example.mosab.sqlite_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    String json = getIntent().getStringExtra("json");
      // ArrayList arrayList = new Gson().fromJson(json, );

    }
}
