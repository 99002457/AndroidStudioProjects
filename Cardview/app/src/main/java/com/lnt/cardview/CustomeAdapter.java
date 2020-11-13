package com.lnt.cardview;



import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomeAdapter extends RecyclerView.Adapter<CustomeAdapter.MyViewHolder> {

    ArrayList<String> data1;
    ArrayList<String> data2;
    Integer[] arr;
    Context context;

    public CustomeAdapter(ArrayList<String> personNames,ArrayList<String> desgnation,Integer[] ar, Context context) {
        data1 = personNames;
        data2=desgnation;
        arr=ar;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,parent,false);
        MyViewHolder vh= new MyViewHolder(v);
        return vh;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        TextView text= holder.name;
        TextView text2= holder.designation;
        ImageView image=holder.image;
        holder.name.setText(data1.get(position));
        holder.designation.setText(data2.get(position));
        holder.image.setImageResource(arr[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,data1.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return data1.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView designation;
        ImageView image;
        public MyViewHolder(View item)
        {
            super(item);
            name=(TextView) item.findViewById(R.id.Name);
            designation=(TextView) item.findViewById(R.id.Designation);
            image=(ImageView)item.findViewById(R.id.imageView);

        }

    }


}
