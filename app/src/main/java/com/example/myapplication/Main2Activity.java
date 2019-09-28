package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentDetail fragmentDetail = (FragmentDetail) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("intent");
        Student student = (Student) bundle.getSerializable("student");

        fragmentDetail.SetData(student);
    }
}
