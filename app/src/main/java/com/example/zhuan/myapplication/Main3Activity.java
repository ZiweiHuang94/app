package com.example.zhuan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main3 );
    }
    public void ritnext(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    public void chalmersnext(View view) {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
}
