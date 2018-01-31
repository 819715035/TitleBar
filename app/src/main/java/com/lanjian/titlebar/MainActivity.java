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
            public void onLeftClick1() {
                Toast.makeText(MainActivity.this,"onLeftClick1",0).show();
            }

            @Override
            public void onRightClick1() {
                Toast.makeText(MainActivity.this,"onRightClick1",0).show();
            }

            @Override
            public void onLeftClick2() {
                Toast.makeText(MainActivity.this,"onLeftClick2",0).show();
            }

            @Override
            public void onRightClick2() {
                Toast.makeText(MainActivity.this,"onRightClick2",0).show();
            }
        });
        final CustomTitleBar titleBar2 = findViewById(R.id.titleBar2);
        titleBar2.setTitleClickListener(new CustomTitleBar.TitleClickListener() {
            @Override
            public void onLeftClick1() {
                Toast.makeText(MainActivity.this,"onLeftClick1",0).show();
            }

            @Override
            public void onRightClick1() {
                Toast.makeText(MainActivity.this,"onRightClick1",0).show();
            }

            @Override
            public void onLeftClick2() {
                Toast.makeText(MainActivity.this,"onLeftClick2",0).show();
            }

            @Override
            public void onRightClick2() {
                Toast.makeText(MainActivity.this,"onRightClick2",0).show();
            }
        });
    }
}
