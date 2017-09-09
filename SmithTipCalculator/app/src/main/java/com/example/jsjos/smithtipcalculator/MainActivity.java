package com.example.jsjos.smithtipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView enterText;
    private EditText enterTotal;
    private EditText serviceRatingHint;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.enterText = (TextView) findViewById(R.id.starRating);
        this.enterTotal = (EditText) findViewById(R.id.totalHint);
        this.serviceRatingHint = (EditText) findViewById(R.id.serviceRatingHint);
        this.submitButton = (Button) findViewById(R.id.submitButton);

        this.submitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Check to make sure input is valid
                if (
                        CalcTip.isDefined(enterTotal.getText().toString()) &&
                        CalcTip.isDefined(serviceRatingHint.getText().toString())
                        )
                {

                }

                // Calculate Tip

            }


        });



    }
}
