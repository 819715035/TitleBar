package com.lanjian.titlebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.lanjian.titlebar.widget.CustomTitleBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CustomTitleBar titleBar4 = findViewById(R.id.titleBar4);
        titleBar4.setTitleClickListener(new CustomTitleBar.TitleClickListener() {
            @Override
            public void onLeftClick() {
                Toast.makeText(MainActivity.this,"leftclick",0).show();
            }

            @Override
            public void onRightClick() {
                Toast.makeText(MainActivity.this,"onRightClick",0).show();
            }

            @Override
            public void onRightButton1Click() {
                Toast.makeText(MainActivity.this,"onRightButton1Click",0).show();
            }

            @Override
            public void onRightButton2Click() {
                Toast.makeText(MainActivity.this,"onRightButton2Click",0).show();
            }
        });
        final CustomTitleBar titleBar2 = findViewById(R.id.titleBar2);
        titleBar2.setTitleClickListener(new CustomTitleBar.TitleClickListener() {
            @Override
            public void onLeftClick() {
                Toast.makeText(MainActivity.this,"leftclick",0).show();
            }

            @Override
            public void onRightClick() {
                Toast.makeText(MainActivity.this,"onRightClick",0).show();
            }

            @Override
            public void onRightButton1Click() {
                Toast.makeText(MainActivity.this,"onRightButton1Click",0).show();
            }

            @Override
            public void onRightButton2Click() {
                Toast.makeText(MainActivity.this,"onRightButton2Click",0).show();
            }
        });
    }
}
