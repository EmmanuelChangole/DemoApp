package com.example.SmartStep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.indoorlocation.SmartStep.R;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAccelerometerData();

            }
        });
    }

    public void openActivityAccelerometerData() {
        Intent intent = new Intent(this, AccelerometerData.class);
        startActivity(intent);
    }
}