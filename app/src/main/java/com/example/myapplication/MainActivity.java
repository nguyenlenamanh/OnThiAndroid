package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendData(Student student) {
        //Toast.makeText(this,student.getName(),Toast.LENGTH_SHORT).show();

        int orientation = getResources().getConfiguration().orientation;

        if(orientation == Configuration.ORIENTATION_PORTRAIT) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("student",student);
            intent.putExtra("intent",bundle);

            startActivity(intent);
        }
        else {
            FragmentDetail fragmentDetail = (FragmentDetail) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);
            fragmentDetail.SetData(student);
        }
    }
}
