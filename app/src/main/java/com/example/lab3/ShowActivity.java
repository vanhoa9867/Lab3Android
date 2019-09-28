package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    TextView txtName, txtDate1, txtDate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        txtName =  findViewById(R.id.textName);
        txtDate1 = findViewById(R.id.textDate1);
        txtDate2 = findViewById(R.id.textDate2);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String date1 = intent.getStringExtra("date1");
        String date2 = intent.getStringExtra("date2");

        txtName.setText("Ho va ten: "+name);
        txtDate1.setText("Ngay nhan: "+date1);
        txtDate2.setText("Ngay tra: "+date2);

    }
}
