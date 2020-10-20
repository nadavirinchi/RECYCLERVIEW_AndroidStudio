package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

// complete skeleton of recycler view

public class myownadapter extends RecyclerView.Adapter<myownadapter.myownholder> {

    String data1[],data2[];
    Context ctx;

    public myownadapter(Context ct, String s1[], String s2[]) {
        ctx = ct;
        data1 = s1;
        data2 = s2;
    }

    @NonNull
    @Override
    public myownholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myinflator = LayoutInflater.from(ctx);
        View myownview =  myinflator.inflate(R.layout.my_row,parent,false);
        return new myownholder(myownview);
    }

    @Override
    public void onBindViewHolder(@NonNull myownholder holder, int position) {
              holder.t1.setText(data1[position]);
              holder.t2.setText(data2[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class myownholder extends RecyclerView.ViewHolder{
        TextView t1,t2;

        public myownholder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.text1);
            t2 = itemView.findViewById(R.id.text2);
        }
    }
}
