package com.example.mesajlasma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewProduct extends RecyclerView.Adapter<viewHolder> {


    // for the first thing we initialize the the ArrayList Object in other to use it in
    // onBindViewHolder

    ArrayList<Product> db  ;
    Context context ; //  The Context in which this LayoutInflater will create its Views

    public RecyclerViewProduct (Context context , ArrayList<Product> data ){
        db = data ;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        context = viewGroup.getContext();


        /// retrieve a standard LayoutInflater instance


        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);

        return new viewHolder(view);
    }





    @Override
    public void onBindViewHolder(@NonNull viewHolder viewholder, int position) {
        Product product = db.get(position);

        // here we're  calling all our data from the product class

        viewholder.message.setText(" "+ product.getMessage()+ " ");
        viewholder.productName.setText(product.getName());

        viewholder.image.setImageResource(product.getImage());


    }


    @Override
    public int getItemCount() {
        return db.size();
    }




}
