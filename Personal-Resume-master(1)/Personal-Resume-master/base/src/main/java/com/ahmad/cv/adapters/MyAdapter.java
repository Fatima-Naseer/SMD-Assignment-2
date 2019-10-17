package com.ahmad.cv.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.activities.ScrollingActivity;
import com.ahmad.cv.base.R;
import com.ahmad.cv.model.demo;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private Context context;
    private ArrayList<demo> getdata;
    private LayoutInflater inflater;

    //constructor
    public MyAdapter(Context context, ArrayList<demo> getdata) {
        this.context=context;
        this.getdata=getdata;
        inflater=LayoutInflater.from(context);
    }


    //inner class
     class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txt1;
        TextView txt2;
        private MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt1= itemView.findViewById(R.id.heading);
            txt2= itemView.findViewById(R.id.detail);
        }
    }//inner class ends

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.custom_row, parent, false);
        MyViewHolder myholder = new MyViewHolder(view);
        return myholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt1.setText(getdata.get(position).getData());
        holder.txt2.setText(getdata.get(position).getDetail());
    }

    @Override
    public int getItemCount() {
        return getdata.size();
    }

}
