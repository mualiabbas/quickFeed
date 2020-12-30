package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureNextButton();
    }

    public void onBtnClick (View view) {
        TextView txtFirst = findViewById(R.id.txtFirst);
        EditText firstName = findViewById(R.id.firstName);
        TextView txtLast = findViewById(R.id.txtLast);
        EditText lastName = findViewById(R.id.lastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        EditText email = findViewById(R.id.email);

        txtFirst.setText("fuck you " + firstName.getText().toString());
        txtLast.setText(lastName.getText().toString());
        txtEmail.setText(email.getText().toString());

        if (firstName.getText().toString() == null || firstName.getText().toString().trim().isEmpty()) {
            txtFirst.setText("Fuck you try again");
        }
    }

    private void ConfigureNextButton() {
        Button  nextButton = (Button) findViewById(R.id.searchbut);
        nextButton.setOnClickListener(new View.OnClickListener()
    }

}