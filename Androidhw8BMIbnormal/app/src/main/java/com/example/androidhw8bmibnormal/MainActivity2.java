package com.example.androidhw8bmibnormal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv4();
    }
    public void bt2(View v){
        finish();
    }
    private void tv4(){
        double height;
        double weight;
        double bmi ;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            DecimalFormat nf = new DecimalFormat("0.00");
            height = Double.parseDouble(bundle.getString("Height")) / 100;
            weight = Double.parseDouble(bundle.getString("Weight"));
            bmi = weight / (height * height);
            TextView bmitit = (TextView)findViewById(R.id.tv3);
            bmitit.setText(nf.format(bmi));
            TextView abnormal = (TextView)findViewById(R.id.tv6);
            if (bmi < 18.5){
                abnormal.setText("異常(體重過輕)");
            }
            else if (bmi > 24.5){
                abnormal.setText("異常(體重過重)");
            }
            else
                abnormal.setText("正常(體重正常)");
        }
    }
}