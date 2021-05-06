package com.example.demosimplecllick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText editText;

    ToggleButton toggleButtonEnabled;

    RadioGroup radioGroupGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
        btnDisplay = findViewById(R.id.btnDisplay);
        editText = findViewById(R.id.etInput);

        toggleButtonEnabled = findViewById(R.id.toggleButtonEnabled);

        radioGroupGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.getText().toString();
                String stringResponse = editText.getText().toString();
                tvDisplay.setText(stringResponse);

                Toast.makeText(MainActivity.this,
                        "My First Toast",
                        Toast.LENGTH_SHORT).show();
            }
        });

        toggleButtonEnabled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (toggleButtonEnabled.isChecked() == true){
                    editText.setEnabled(true);
                    editText.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    editText.setEnabled(false);
                    editText.setBackgroundColor(Color.RED);

            }
        };

    });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = editText.getText().toString();
                int checkedRadioId = radioGroupGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.rbGenderMale){
                    // Write the code when male selected
                    stringResponse = "He says " + editText.getText().toString();
                }
                else{
                    // Write the code when female selected
                    stringResponse = "She says " + editText.getText().toString();

                }
                tvDisplay.setText(stringResponse);
            }
        });

    }}