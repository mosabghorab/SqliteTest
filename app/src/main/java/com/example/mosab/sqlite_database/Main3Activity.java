package com.example.mosab.sqlite_database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;

final public class Main3Activity extends AppCompatActivity {
private Button btnSend;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnSend = findViewById(R.id.btn_send);
        Student s1 = new Student("mosab", 5);
        Student s2 = new Student("Ahmed", 57);
        Student s3 = new Student("Omar", 1);
        Student s4 = new Student("Mahmoud", 53);
        Student s5 = new Student("Khaled", 65);
        final ArrayList<Student> students =
                new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
               String myjson =  new Gson().toJson(students);
                Intent intent = new Intent(getBaseContext(), Main4Activity.class);
                intent.putExtra("json", myjson);
                startActivity(intent);
            }
        });
    }
}
