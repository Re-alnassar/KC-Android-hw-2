package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText NAME = findViewById(R.id.NAME);
        EditText AGE = findViewById(R.id.AGE);
        EditText JOB = findViewById(R.id.JOB);
        EditText EMAIL = findViewById(R.id.EMAIL);
        EditText PHONE = findViewById(R.id.PHONE);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String name = NAME.getText().toString();
                int age = Integer.parseInt(AGE.getText().toString());
                String job = JOB.getText().toString();
                String email = EMAIL.getText().toString();
                int phone = Integer.parseInt(PHONE.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("item1", name);
                intent.putExtra("item2",age);
                intent.putExtra("item3",job);
                intent.putExtra("item4",email);
                intent.putExtra("item5",phone);

                startActivity(intent);

            }
        });
    }
}