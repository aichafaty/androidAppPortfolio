package com.example.myapplicationAnd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.competence_main);
        setContentView(R.layout.qualite_main);
        setContentView(R.layout.reference_main);
        setContentView(R.layout.services_main);
        setContentView(R.layout.centreinteret_main);
        setContentView(R.layout.contact_main);
    }
}