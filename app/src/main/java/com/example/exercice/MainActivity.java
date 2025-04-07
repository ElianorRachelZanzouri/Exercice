package com.example.exercice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //variables
    TextView txtCount;    //count in the application
    EditText edtNumber;  //input
    Button btnAdd, btnSub;

    int count = 0;        //count in the code Java

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables=id

        txtCount = findViewById(R.id.txtCount);
        edtNumber = findViewById(R.id.edtNumber);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);

        count = Integer.parseInt(txtCount.getText().toString());

        //btn Add : on Click
        btnAdd.setOnClickListener(
                view -> {
                    String input = edtNumber.getText().toString();
                    if (!input.isEmpty()) {

                        if (count + 1 == Integer.parseInt(edtNumber.getText().toString())) {
                            txtCount.setText("Finish!");
                        } else {

                            txtCount.setText(String.valueOf(++count));//count=>int  String.valueOf(count++)=>String
                        }
                    }
                }
        );

        //btn Sub : on click
        btnSub.setOnClickListener(
                view -> {
                    String input = edtNumber.getText().toString();
                    if (!input.isEmpty()) {

                        if (count  == Integer.parseInt(edtNumber.getText().toString())) {
                            txtCount.setText("Finish!");
                        } else {
                            txtCount.setText(String.valueOf(count--));//count=>int  String.valueOf(count++)=>String
                        }
                    }
                }
        );
    }
}