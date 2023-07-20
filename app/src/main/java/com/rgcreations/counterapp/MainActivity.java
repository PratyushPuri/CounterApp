package com.rgcreations.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView counter, num;
    int count = 0;
    Button bt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = findViewById(R.id.counter);
        num = findViewById(R.id.num);
        bt = findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num.setText(""+mthod());
                    Toast.makeText(MainActivity.this, "Counter Increased", Toast.LENGTH_SHORT).show();
            }
        });


        }

    public int mthod(){
        return ++count;
    }

}

