package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentDetail extends Fragment {

    public TextView tvName,tvYear,tvEmail,tvAddress;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frament_detail,container,false);

        tvName = v.findViewById(R.id.tvName);
        tvYear = v.findViewById(R.id.tvYear);
        tvEmail = v.findViewById(R.id.tvEmail);
        tvAddress = v.findViewById(R.id.tvAddress);

        return v;
    }

    public void SetData(Student student){
        tvName.setText("Họ tên: " + student.getName());
        tvYear.setText("Năm sinh: " + student.getYear());
        tvAddress.setText("Địa chỉ: " + student.getAddress());
        tvEmail.setText("Email: " + student.getEmail());
    }
}
