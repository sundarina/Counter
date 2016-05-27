package me.mihael.sundarina.counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Screen3 extends AppCompatActivity {

    private EditText text;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        setTitle("Screen #3");
        text = (EditText) findViewById(R.id.editText);
        output = (TextView) findViewById(R.id.output);
    }

    public void buttonClick1(View v) {
        //Log.d("BTN", "Button clicked");
        Intent scr1 = new Intent(this, MainActivity.class);
        startActivity(scr1);

    }

    public void buttonClick2 (View v) {
        //Log.d("BTN", "Button clicked");
        Intent scr2 = new Intent(this, Screen2.class);
        startActivity(scr2);
    }

    public void myClickHandler(View view) {
        switch (view.getId()) {
            case R.id.button:
                RadioButton celsiusButton = (RadioButton) findViewById(R.id.radio0);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radio1);
                if (text.getText().length() == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if (celsiusButton.isChecked()) {
                    output.setText(String
                            .valueOf(convertFahrenheitToCelsius(inputValue)));
                } else {
                    output.setText(String
                            .valueOf(convertCelsiusToFahrenheit(inputValue)));
                }
                // Switch to the other button
              /*  if (fahrenheitButton.isChecked()) {
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(true);
                } else {
                    fahrenheitButton.setChecked(true);
                    celsiusButton.setChecked(false);
                }
                break;*/
        }
    }

    // Converts to celsius
    private float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // Converts to fahrenheit
    private float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
