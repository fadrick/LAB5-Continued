package com.example.recyclerviewandroid;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private ArrayList<Integer> images=new ArrayList<>();
    private ArrayList<String> name=new ArrayList<>();
    Context context;


    public Adapter(Context context, ArrayList<Integer> images, ArrayList<String> name){
        this.images = images;
        this.name = name;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.row,parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


        holder.imageView.setImageResource((images.get(position)));
        holder.textView.setText(name.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(position==0){

                    Intent intent=new Intent(context,Second.class);

                    intent.putExtra("Url","http://www.lesco.gov.pk/Modules/CustomerBill/CheckBill.asp");
                    context.startActivity(intent);



                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=(ImageView) itemView.findViewById(R.id.imageview);
            textView=(TextView) itemView.findViewById(R.id.text);

        }
    }
}
