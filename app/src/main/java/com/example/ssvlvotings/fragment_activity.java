package com.example.ssvlvotings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class fragment_activity extends AppCompatActivity {
    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_activity);
        display = findViewById(R.id.uname);
        String username = getIntent().getStringExtra("keyuname");
        display.setText(username);
    }
}