package com.example.lab_3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText sub;
        Button btn;

        sub = (EditText) findViewById(R.id.namereader);
        btn = (Button) findViewById(R.id.nextbtn);
        SharedPreferences share= getSharedPreferences("pass",MODE_PRIVATE);

        //on click,pass data
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pintent = new Intent(MainActivity.this, NameActivity.class);
                pintent.putExtra("pass",sub.getText().toString());
                startActivityForResult(pintent,1);


            }


        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


}



