package me.mihael.sundarina.counter;

;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class Screen2 extends AppCompatActivity {

    TextView textV;
    TextView textW;
    //TextView textY;
//    RadioGroup radiogroup;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        setTitle("Screen #2");
        textV = (TextView) findViewById(R.id.text1);
        textW = (TextView) findViewById(R.id.text2);
        //textY = (TextView) findViewById(R.id.text3);

//        radiogroup = (RadioGroup) findViewById(R.id.radioGroup1);
//        radiogroup.clearCheck();

        /*radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case -1:
                        textY.setText("0");
                        break;
                    case R.id.beBatton:
                        textV.setText("1");
                        break;
                    case R.id.notBeButton:
                        textW.setText("2");
                        break;
                }
            }
        });*/

    }

    public void buttonClick3(View v) {
        //Log.d("BTN", "Button clicked");
        Intent scr3 = new Intent(this, Screen3.class);
        startActivity(scr3);

    }

    public void buttonClick1(View v) {
        //Log.d("BTN", "Button clicked");
        Intent scr1 = new Intent(this, MainActivity.class);
        startActivity(scr1);
        //finish();
    }




    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.to_be:
                if (checked)
                    // Pirates are the best
                    textV.setText("Always say YES");
                    textW.setText("");
                    break;
            case R.id.not_to_be:
                if (checked)
                    // Ninjas rule
                    textV.setText("");
                    textW.setText("Never say NOT");
                    break;
        }
    }


   /* public void radioButtonClick(View v) {
        //boolean checked = ((RadioButton) v).isChecked();
        // Check which radio button was clicked
        RadioButton rb = (RadioButton) v;
        switch (v.getId()) {
            case R.id.beBatton:
                textV.setText("1");
                break;
            case R.id.notBeButton:
                textW.setText("2");
                break;
        }*/

}

