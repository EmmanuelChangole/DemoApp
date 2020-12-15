package com.example.SmartStep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import io.indoorlocation.SmartStep.R;

public class OpenLoaction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_loaction);
    }

    public void OpenLocation(View view)
    {
        Intent intent=new Intent(this,MapActivity.class);
        startActivity(intent);
    }
}