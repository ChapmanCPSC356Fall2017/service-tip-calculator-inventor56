package com.example.jsjos.smithtipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView enterText;
    private EditText enterTotal;
    private NumberPicker serviceRatingHint;
    private Button submitButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.enterText = (TextView) findViewById(R.id.starRating);
        this.enterTotal = (EditText) findViewById(R.id.totalHint);
        this.serviceRatingHint = (NumberPicker) findViewById(R.id.serviceRatingHint);
        this.submitButton = (Button) findViewById(R.id.submitButton);
        this.resultText = (TextView) findViewById(R.id.resultText);

        serviceRatingHint.setMinValue(1);
        serviceRatingHint.setMaxValue(10);

        this.submitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String priceStr = enterTotal.getText().toString();
                int ratingInt = serviceRatingHint.getValue();

                // Check to make sure input is valid
                try {
                    double priceInt = Double.parseDouble(priceStr);
                    // Calculate and set Tip
                    double result = CalcTip.getTip(priceInt, ratingInt);
                    resultText.setText("Tip Total: $" + result + "\nTotal With Tip: $" + CalcTip.roundNum(result + priceInt));
                }
                catch (Exception erro) {
                    resultText.setText("Wrong Values. Please Try Again");
                }

            }


        });



    }
}
