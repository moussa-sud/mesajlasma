package com.example.mesajlasma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv ;
    Button tb ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);


        ArrayList<Product> products = new ArrayList<>();


        products.add(new Product("Omer ELDRISSI", "Hello Moussa how are you", R.drawable.dd, false ));
        products.add(new Product("YASSINE ABOUZiD", "Hiii !!!" , R.drawable.bb, false ));
        products.add(new Product("KHALID ABOUZiD", "Where are you ??" , R.drawable.gg, true ));
        products.add(new Product("OMER ABOUZiD", "hello" , R.drawable.dd, false ));
        products.add(new Product("AHMED ELDRISSI", "Where are you ??", R.drawable.bb, true ));
        products.add(new Product("AHMED RADI", "Hello Moussa how are you" , R.drawable.dd, false ));
        products.add(new Product("ABDELLAH RADI", "Where are you ??", R.drawable.bb, false ));
        products.add(new Product("OMER ELDRISSI", "hello" , R.drawable.dd, false ));
        products.add(new Product("YAHYA RADI", "Where are you ??", R.drawable.dd, false ));
        products.add(new Product("ABDELLAH ABOUZiD" , "hello" , R.drawable.dd, false ));
        products.add(new Product("YAHYA ABOUZiD", "Where are you ??", R.drawable.bb, true ));
        products.add(new Product("OMER ELDRISSI", "Hello Moussa how are you" , R.drawable.dd, false ));
        products.add(new Product("ANOIRE RADI", "hello" , R.drawable.bb, true ));
        products.add(new Product("MOUHAMED ELDRISSI", "Hello Moussa how are you", R.drawable.bb, false ));






        RecyclerViewProduct RecyclerAdapter = new RecyclerViewProduct(MainActivity.this, products);

        rv.setAdapter(RecyclerAdapter);
        rv.hasFixedSize();




        // layout for vertical orientation

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(linearLayoutManager);





    }
}