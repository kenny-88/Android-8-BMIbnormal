package com.example.androidhw8bmibnormal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt1(View v){
        EditText tv1 = (EditText)findViewById(R.id.ed1);
        EditText tv2 = (EditText)findViewById(R.id.ed2);
        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("Height", tv1.getText().toString());
        bundle.putString("Weight", tv2.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}