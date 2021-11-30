package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class App_3 extends AppCompatActivity {
TextView tvZagadka,tvItog;
EditText edOtvet;
int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app3);
        tvZagadka=findViewById(R.id.tvZagadka);
        tvItog=findViewById(R.id.tvItog);
        edOtvet=findViewById(R.id.edOtvet);
    }
    public  void onBtnOtvetClick(View view) {
        String txt1=this.getResources().getString(R.string.otv_zag_1);
        String txt2=this.getResources().getString(R.string.otv_zag_2);
        String txt3=this.getResources().getString(R.string.otv_zag_3);

      switch (counter){
          case 1:if(edOtvet.getText().toString().equals(txt1)){
              tvItog.setText("Все верно!");
          }else {tvItog.setText("не правильно!Подумайте ещё!");
          }
          break;
          case 2:if(edOtvet.getText().toString().equals(txt2)){
              tvItog.setText("Все верно!");
          }else {tvItog.setText("не правильно! Подумайте ещё!");
          }
              break;
          case 3:if(edOtvet.getText().toString().equals(txt3)){
              tvItog.setText("Все верно!");
          }else {tvItog.setText("не правильно!Подумайте ещё!");
          }
              break;
      }
    }
    public  void onBtnNovZagClick(View view){
int a=(int)(Math.random()*3);
   switch (a){
       case 0:tvZagadka.setText(R.string.zag_1);
       counter=1;
       break;
       case 1:tvZagadka.setText(R.string.zag_2);
       counter=2;
           break;
       case 2:tvZagadka.setText(R.string.zag_3);
       counter=3;
           break;
  }
    }
}