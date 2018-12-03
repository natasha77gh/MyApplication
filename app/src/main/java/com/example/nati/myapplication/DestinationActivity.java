package com.example.nati.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DestinationActivity extends AppCompatActivity {
    String name, lastName, number, email,age;
    TextView nameTextView, lastnameTextView, numberTextView, emailTextView, ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        Intent intent=getIntent();
        name = intent.getStringExtra("name");
        lastName = intent.getStringExtra("lastName");
        number = intent.getStringExtra("number");
        email = intent.getStringExtra("email");
        age =intent.getStringExtra("age");
        nameTextView=findViewById(R.id.nameTV);
        lastnameTextView=findViewById(R.id.lastNameTV);
        numberTextView=findViewById(R.id.numberTV);
        emailTextView=findViewById(R.id.EmailTV);
        ageTextView=findViewById(R.id.ageTV);

        nameTextView.setText(name);
        lastnameTextView.setText(lastName);
        numberTextView.setText(number);
        emailTextView.setText(email);
        ageTextView.setText(age);


    }
}
