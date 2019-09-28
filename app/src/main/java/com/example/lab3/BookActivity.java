package com.example.lab3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BookActivity extends AppCompatActivity {
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        final EditText SendValue, SendDate1, SendDate2;
        SendValue= findViewById(R.id.name);
        SendDate1 = findViewById(R.id.date1);
        SendDate2= findViewById(R.id.date2);
        btnClick = findViewById(R.id.btnBook);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BookActivity.this, ShowActivity.class);

                intent.putExtra("name",SendValue.getText().toString());
                intent.putExtra("date1",SendDate1.getText().toString());
                intent.putExtra("date2",SendDate2.getText().toString());

                startActivity(intent);
            }
        });
    }
}
