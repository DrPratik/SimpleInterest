package com.example.simpleinterest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText prin,rat,tim;
    Button cal;
    int pr,time;
    double rate;
    double ans;
    TextView ans1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prin=findViewById(R.id.princamt);
        rat=findViewById(R.id.rate);
        tim=findViewById(R.id.timeyr);
        cal=findViewById(R.id.button);
        ans1=findViewById(R.id.ans);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!prin.getText().toString().isEmpty() && !rat.getText().toString().isEmpty() && !tim.getText().toString().isEmpty()) {
                    pr = Integer.parseInt(prin.getText().toString());
                    rate = Float.parseFloat(rat.getText().toString());
                    time = Integer.parseInt(tim.getText().toString());
                    ans = (pr * rate * time) / 100;
                    ans1.setText(String.valueOf(ans));
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Please enter all values",Toast.LENGTH_SHORT).show();
                }
                }
        });
    }
}
