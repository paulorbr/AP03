package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2;
    private Button buttonSomar;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        buttonSomar = findViewById(R.id.buttonSomar);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editTextNumber1.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                int resultado = num1 + num2;
                textViewResultado.setText("Resultado: " + resultado);
            }
        });
    }
}