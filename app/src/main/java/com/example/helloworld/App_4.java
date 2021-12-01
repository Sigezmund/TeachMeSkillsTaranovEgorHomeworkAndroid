package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class App_4 extends AppCompatActivity {
EditText edColok;
Button btnRavno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app4);
edColok=findViewById(R.id.edColok);
btnRavno=findViewById(R.id.btnRavno);
btnRavno.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String str=edColok.getText().toString();
        Object result = null;
        ScriptEngineManager manager=new ScriptEngineManager();
        ScriptEngine engine=manager.getEngineByName("js");
        try {
             result=engine.eval(str);
        } catch (ScriptException e) {
            Toast.makeText(App_4.this,"введено некоректное выражение!",Toast.LENGTH_LONG).show();
        }

        edColok.setText(result.toString());

    }
});
    }
}