package com.example.codelabactivitiesandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Bt1;
    Button Bt2;
    Button Bt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bt1 = (Button) findViewById(R.id.button1);
        Bt2 = (Button) findViewById(R.id.button2);
        Bt3 = (Button) findViewById(R.id.button3);
    }


    public void launchSecondActivity(View view) {
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }
}
