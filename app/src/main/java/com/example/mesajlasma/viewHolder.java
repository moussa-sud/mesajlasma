package com.example.mesajlasma;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {

    //View holder it is thing which helps u you to
    // reduce find view by id calls. Let give you an example
    // One ViewHolder object is created for every time the onCreateViewHolder is called.

    //    Button favourite;
    TextView message , productName ,favourite;
    ImageView image ;


    public viewHolder(@NonNull View itemView) {
        super(itemView);


        message = itemView.findViewById(R.id.price_TX);
        productName = itemView.findViewById(R.id.nameTV);
        image = itemView.findViewById(R.id.product_IM);

    }
}
