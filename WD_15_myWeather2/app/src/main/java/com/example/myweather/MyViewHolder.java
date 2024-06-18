package com.example.myweather;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameview, emailview;
    Button pastbtn;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameview = itemView.findViewById(R.id.name);
        emailview = itemView.findViewById(R.id.email);
        pastbtn = itemView.findViewById(R.id.pastbtn);
    }
}