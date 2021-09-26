package com.example.salonna;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import Interfaces.ItemClickListener;

public class Admin_BabyAndKids_baby_Cream_ViewHolder extends RecyclerView.ViewHolder{
    TextView tw_title, tw_brand,tw_price;
    ImageView imageView;
    ItemClickListener itemClickListener;
    Button btn_edit;
    Button Delete;


    public Admin_BabyAndKids_baby_Cream_ViewHolder(@NonNull View itemView) {
        super(itemView);

        tw_title = (TextView)itemView.findViewById(R.id.cream_title);
        tw_brand = (TextView)itemView.findViewById(R.id.cream_brand);
        tw_price = (TextView)itemView.findViewById(R.id.cream_price);
        btn_edit = itemView.findViewById(R.id.btn_edit_cream);
        Delete = itemView.findViewById(R.id.delete_cream_admin);
    }
}
