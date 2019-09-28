package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FragmentList extends Fragment {

    ArrayList<Student> students;
    CustomAdapter customAdapter;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list,container,false);

        listView = v.findViewById(R.id.fragListView);

        students = new ArrayList<>();
        students.add(new Student("Nam Anh 1",1998,"147 CMT8","nguyenlenamanh.2016@gmail.com",R.drawable.doremon));
        students.add(new Student("Nam Anh 2",1998,"147 CMT8","nguyenlenamanh.2016@gmail.com",R.drawable.doremon));
        students.add(new Student("Nam Anh 3",1998,"147 CMT8","nguyenlenamanh.2016@gmail.com",R.drawable.doremon));
        students.add(new Student("Nam Anh 4",1998,"147 CMT8","nguyenlenamanh.2016@gmail.com",R.drawable.doremon));
        students.add(new Student("Nam Anh 5",1998,"147 CMT8","nguyenlenamanh.2016@gmail.com",R.drawable.doremon));

        customAdapter = new CustomAdapter(getActivity(),R.layout.listitem,students);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.SendData(students.get(i));
            }
        });

        return v;
    }


}
