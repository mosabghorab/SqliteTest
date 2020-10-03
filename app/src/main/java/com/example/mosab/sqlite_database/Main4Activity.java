package com.example.mosab.sqlite_database;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    String json = getIntent().getStringExtra("json");
      // ArrayList arrayList = new Gson().fromJson(json, );

    }
}
