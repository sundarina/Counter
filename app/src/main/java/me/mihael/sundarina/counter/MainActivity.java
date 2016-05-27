package me.mihael.sundarina.counter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Integer counter = 0;
    private TextView textV;
    Button b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button clickButton = (Button) findViewById(R.id.buttonPush);
        textV = (TextView) findViewById(R.id.label);
        b5 = (Button) findViewById(R.id.button5);

        View.OnClickListener ocLB5 = new View.OnClickListener() {
            @Override

            public void onClick(View v) {
            b5.setText("hello");
            }
        };

        b5.setOnClickListener(ocLB5);
    }

    public void buttonClick(View v) {
        //Log.d("BTN", "Button clicked");
        counter++;
        textV.setText(counter.toString());
    }

    public void buttonClick2(View v) {
        //Log.d("BTN", "Button clicked");
        Intent scr2 = new Intent(this, Screen2.class);
        startActivity(scr2);

    }

    public void buttonClick3(View v) {
        //Log.d("BTN", "Button clicked");
        Intent scr3 = new Intent(this, Screen3.class);
        startActivity(scr3);
    }
}
