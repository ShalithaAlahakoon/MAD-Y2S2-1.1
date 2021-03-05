package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText name,batch,regNo;
    private TextView Display,Display2,Display3;
    private Button runButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.nameText);
        batch = (EditText) findViewById(R.id.batchText);
        regNo = (EditText) findViewById(R.id.regNoText);
        Display = (TextView) findViewById(R.id.Display);
        Display2 = (TextView) findViewById(R.id.Display2);
        Display3 = (TextView) findViewById(R.id.Display3);
        runButton = (Button) findViewById(R.id.runButton);

        runButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display(regNo.getText().toString(),batch.getText().toString(),name.getText().toString());

            }
        });

    }

    protected void Display(String regNo, String batch, String name){

        Display.setText("name = " + name  );
        Display2.setText(" regNo = " + regNo  );
        Display3.setText(" batch = " + batch );

    }


}