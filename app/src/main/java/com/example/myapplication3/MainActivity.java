package com.example.myapplication3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button resetButton;
    private ImageView imageView;
    private TextView textView;
    private final String TAG = "MainActivity";
    private int clickCouont = 0;
    private Button jumpButton;//初始化所有变量

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);//app闪退就看run
        resetButton = findViewById(R.id.resetButton);
        imageView = findViewById(R.id.iamgeView);
        textView = findViewById(R.id.text_View);
        jumpButton = findViewById(R.id.jump_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCouont++;
                if(clickCouont <= 2)//害怕越界
                {
                    changeUi();
                }

            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeUi();
            }
        });//重置

        jumpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BilibiliActivity.class);
                startActivity(intent);//跳转
            }
        });//跳转

    }
    private void changeUi(){//封装的好处！！！！
        int image = ConstantUtils.images[clickCouont];//如何引用全局变量
        String title = ConstantUtils.titles[clickCouont];
        imageView.setImageResource(image);//找资源
        textView.setText(title);//逻辑里面写的修改会覆盖出生时的初始设定
    }
}
