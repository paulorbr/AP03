package net.hanshq.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText number1EditText;
    private EditText number2EditText;
    private Button sumButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        number1EditText = findViewById(R.id.number1);
        number2EditText = findViewById(R.id.number2);
        sumButton = findViewById(R.id.sumButton);
        resultTextView = findViewById(R.id.resultText);


        // Set click listener for the button
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateSum();
            }
        });

    }

    private void calculateSum() {
        String num1Str = number1EditText.getText().toString();
        String num2Str = number2EditText.getText().toString();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            resultTextView.setText("Por favor coloque os dois números");
            return;
        }


        try {
             double num1 = Double.parseDouble(num1Str);
             double num2 = Double.parseDouble(num2Str);

            double sum = num1 + num2;

            resultTextView.setText("Soma: " + sum);


        }
        catch(NumberFormatException e){
            resultTextView.setText("Formato inválido");
        }

    }
}