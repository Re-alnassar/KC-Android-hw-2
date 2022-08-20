package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);


        Bundle bundle = getIntent().getExtras();

        String name1 = bundle.getString("item1");
        int age1 = bundle.getInt("item2");
        String job1 = bundle.getString("item3");
        String email1 = bundle.getString("item4");
        int phone1 = bundle.getInt("item5");

        textView.setText(name1);
        textView2.setText(String.valueOf(age1));
        textView3.setText(job1);
        textView4.setText(email1);
        textView5.setText(String.valueOf(phone1));


        };

    }
