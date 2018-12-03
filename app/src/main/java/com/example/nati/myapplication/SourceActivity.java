package com.example.nati.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SourceActivity extends AppCompatActivity {
    EditText nameET, lastNameET, EmailET, numberET, ageEt;
    Button nextButton;
    String name, lastName, number, email,age;
    public static final String EXTRA_SCORE1 ="name",EXTRA_SCORE2 = "lastName",EXTRA_SCORE3 = "age",EXTRA_SCORE4 = "email",EXTRA_SCORE5 = "number";

    DestinationActivity destinationActivity= new DestinationActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source);
        nameET = findViewById(R.id.nameEditText);
        lastNameET = findViewById(R.id.lastNameEditText);
        EmailET = findViewById(R.id.EmailEditText);
        numberET = findViewById(R.id.numberEditText);
        ageEt = findViewById(R.id.ageEditText);
        nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameET.getText().toString();
                lastName = lastNameET.getText().toString();
                number = numberET.getText().toString();
                email = EmailET.getText().toString();
                age =ageEt.getText().toString();
               // if(emailIsValid(email)){
                    //Intent myIntent = new Intent(SourceActivity.this, DestinationActivity.class);
                    sendData();

               // }

            }
        });


    }

    boolean emailIsValid(String email) {
        if (email.contains("@")) {
            return true;
        }
        return false;
    }

    private void sendData() {
        Intent resultIntent =new Intent(SourceActivity.this, DestinationActivity.class);
        resultIntent.putExtra("name", name);
        resultIntent.putExtra(EXTRA_SCORE2, lastName);
        resultIntent.putExtra(EXTRA_SCORE3, age);
        resultIntent.putExtra(EXTRA_SCORE4, email);
        resultIntent.putExtra(EXTRA_SCORE5, number);
        SourceActivity.this.startActivity(resultIntent);

        // setResult(RESULT_OK, resultIntent);

    }
}
