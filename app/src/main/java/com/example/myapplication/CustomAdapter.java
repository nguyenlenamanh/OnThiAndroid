package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Student> {

    private Context context;
    private int resource;
    private ArrayList<Student> students;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Student> students) {
        super(context, resource, students);
        this.context = context;
        this.resource = resource;
        this.students = students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource,null);

            viewHolder = new ViewHolder();

            viewHolder.imageView = convertView.findViewById(R.id.lvItemImage);
            viewHolder.textView = convertView.findViewById(R.id.lvItemName);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Student student = students.get(position);

        viewHolder.imageView.setImageResource(student.getImage());
        viewHolder.textView.setText(student.getName());

        return convertView;
    }

    public class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }
}
