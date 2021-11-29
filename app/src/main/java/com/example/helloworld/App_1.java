package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class App_1 extends AppCompatActivity {
EditText editText;
    Button btnFormation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_1);
        editText=findViewById(R.id.edText);
        btnFormation=findViewById(R.id.btnFormation);
        btnFormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String resultText="";
                char chArr[]=editText.getText().toString().toCharArray();
                for(int i=0;i<chArr.length;i++){
                    if(chArr[i]=='A'||chArr[i]=='a'){
                        chArr[i]='O';
                    }
                    resultText=resultText+chArr[i];
                }
                editText.setText(resultText);
            }

        });
    }
}