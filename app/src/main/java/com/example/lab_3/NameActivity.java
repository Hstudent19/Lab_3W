package com.example.lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);


        TextView next;
        next = (TextView) findViewById(R.id.textView1);
        Bundle merge = getIntent().getExtras();
        String read =merge.getString("pass");

        next.setText("Welcome "+read);

        Button btn1;
        btn1 = (Button) findViewById(R.id.return1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });





    }
}