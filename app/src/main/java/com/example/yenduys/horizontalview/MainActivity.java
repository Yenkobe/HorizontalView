package com.example.yenduys.horizontalview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    // vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<Integer> mImage = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     getImages();

    }

    private void getImages(){

        mImage.add(R.drawable.car1);
        mNames.add("Yenduy");

        mImage.add(R.drawable.car2);
        mNames.add("Yenduy sanchez");

        mImage.add(R.drawable.car3);
        mNames.add("natalia");

        mImage.add(R.drawable.car4);
        mNames.add("manuel");

        mImage.add(R.drawable.car5);
        mNames.add("Yenduy");

        mImage.add(R.drawable.car6);
        mNames.add("Yenduy");

        intRecycleView();


    }

    private void intRecycleView(){
        Log.d(TAG, "intRecycleView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false); // the horizontal step
        RecyclerView recyclerView= findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(this,mNames,mImage);
        recyclerView.setAdapter(adapter);




    }
}
