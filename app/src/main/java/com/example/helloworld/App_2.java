package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class App_2 extends AppCompatActivity {
EditText edMagic;
TextView textViewResult;
Button btnQuestion;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);
        edMagic=findViewById(R.id.edMagicQuestion);
        textViewResult=findViewById(R.id.textViewResult);
        btnQuestion=findViewById(R.id.buttonQuestion);
        imageView=findViewById(R.id.imageView);
        btnQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edMagic.getText().toString().equals("")){
                int a = (int) ( Math.random() * 8 );
                switch (a){
                    case 1: textViewResult.setText("да!");
                        imageView.setImageResource(R.drawable.img_salut);
                    break;
                    case 2: textViewResult.setText("нет!");
                        imageView.setImageResource(R.drawable.img_no);
                        break;
                    case 3: textViewResult.setText("все будет хорошо, не сомневайтесь!");
                        imageView.setImageResource(R.drawable.img_aga_smeh);
                        break;
                        case 4: textViewResult.setText("это маловероятно.");
                            imageView.setImageResource(R.drawable.img_fig);
                        break;
                    case 5: textViewResult.setText("вам нужна психологическая разгрузка!");
                        imageView.setImageResource(R.drawable.img_relax);
                        break;
                    case 6: textViewResult.setText("Кто ж тебе правду скажет! ;)");
                        imageView.setImageResource(R.drawable.img_neispov);
                        break;
                    case 7: textViewResult.setText("вопрос задан очень умным интересным и красивым человеком, магический шар влюбился и потерял дар речи!");
                    imageView.setImageResource(R.drawable.img_colobock);
                        break;

                }
                }
            }
        });
    }
}