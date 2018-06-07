package com.example.yahoo.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com.example.yahoo.assignment2.Validator isValid = new com.example.yahoo.assignment2.Validator();

        Button Mybutton = (Button) findViewById(R.id.validate);
        final TextView result = (TextView) findViewById(R.id.result);
        final EditText password = (EditText) findViewById(R.id.password);

        Mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rule = com.example.yahoo.assignment2.Validator.Stage3(password.getText().toString());
                if(rule == 0)
                    result.setText("Not valid password");
                else if(rule == 1)
                    result.setText("Too Weak");
                else if(rule == 2)
                    result.setText("Not Strong");
                else if(rule == 3)
                    result.setText("Strong");
                else if(rule ==4)
                    result.setText("Very Strong");

            }
        });
    }

}
