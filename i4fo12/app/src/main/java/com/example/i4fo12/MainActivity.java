package com.example.i4fo12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstnumber = findViewById(R.id.firstnumber);
        EditText secoundnumber = findViewById(R.id.secoundnumber);
        Button Plural = findViewById(R.id.button);
        TextView total = findViewById(R.id.total);
        Button Subtract = findViewById(R.id.button2);
        Button Multiplication = findViewById(R.id.button3);
        Button Dividing = findViewById(R.id.button4);

        Plural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             String a = firstnumber.getText().toString();
             String b = secoundnumber.getText().toString();

             int x = Integer.parseInt(a);
             int y = Integer.parseInt(b);

             int z = x + y;

             total.setText("total is" + z);
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstnumber.getText().toString();
                String b = secoundnumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = x - y;

                total.setText("total is" + z);
            }
        });
        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstnumber.getText().toString();
                String b = secoundnumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = x * y;

                total.setText("total is" + z);
            }
        });
        Dividing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstnumber.getText().toString();
                String b = secoundnumber.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

                int z = x / y;

                total.setText("total is" + z);
            }
        });
    }
}