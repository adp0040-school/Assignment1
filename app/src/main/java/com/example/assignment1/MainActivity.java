package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button convertButton;
    EditText fEditText, cEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fEditText = findViewById(R.id.fEditText);
        cEditText = findViewById(R.id.cEditText);
        convertButton = findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fahrenheit = fEditText.getText().toString();
                double valF;
                valF = Double.parseDouble(fahrenheit);
                double valC;
                valC = (valF - 32)*5/9;
                String celcius = Double.toString(valC);
                cEditText.setText(celcius);
            }
        });
    }
}
