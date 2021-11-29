package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnApp1,btnApp2,btnApp3,btnApp4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnApp1=findViewById(R.id.button1);
        btnApp2=findViewById(R.id.button2);
        btnApp3=findViewById(R.id.button3);
        btnApp4=findViewById(R.id.button4);
        btnApp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,App_1.class);
                startActivity(intent);
            }
        });
    }
}