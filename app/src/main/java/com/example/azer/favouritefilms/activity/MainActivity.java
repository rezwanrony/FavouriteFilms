package com.example.azer.favouritefilms.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.azer.favouritefilms.Ajay_activity;
import com.example.azer.favouritefilms.Akshay_activity;
import com.example.azer.favouritefilms.Amir_activity;
import com.example.azer.favouritefilms.R;
import com.example.azer.favouritefilms.Ranbir_activity;
import com.example.azer.favouritefilms.Salman_activity;
import com.example.azer.favouritefilms.Shahrukh_activity;
import com.example.azer.favouritefilms.adapter.CustomAdapter;
import com.example.azer.favouritefilms.model.Actor;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv_artist;
    ArrayList<Actor>actorArrayList;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_artist=(ListView)findViewById(R.id.lv_artist);
        actorArrayList=new ArrayList<Actor>();
        ArrayListItem();
        adapter=new CustomAdapter(this,actorArrayList);
        lv_artist.setAdapter(adapter);
        lv_artist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i=new Intent(MainActivity.this, Shahrukh_activity.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1=new Intent(MainActivity.this, Salman_activity.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2=new Intent(MainActivity.this, Amir_activity.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3=new Intent(MainActivity.this, Ajay_activity.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4=new Intent(MainActivity.this, Akshay_activity.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5=new Intent(MainActivity.this, Ranbir_activity.class);
                        startActivity(i5);
                        break;
                }
            }
        });
    }

    private void ArrayListItem(){
        String []artist={"Shahrukh Khan","Salman Khan","Amir Khan","Ajay Devgan","Akshay Kumar","Ranbir Kapoor"};
        int [] images={R.drawable.shahrukh,R.drawable.salman,R.drawable.amir,R.drawable.ajay,R.drawable.akshay,R.drawable.ranbir};
        Actor actor=new Actor(artist[0],images[0]);
        Actor actor1=new Actor(artist[1],images[1]);
        Actor actor2=new Actor(artist[2],images[2]);
        Actor actor3=new Actor(artist[3],images[3]);
        Actor actor4=new Actor(artist[4],images[4]);
        Actor actor5=new Actor(artist[5],images[5]);
        actorArrayList.add(actor);
        actorArrayList.add(actor1);
        actorArrayList.add(actor2);
        actorArrayList.add(actor3);
        actorArrayList.add(actor4);
        actorArrayList.add(actor5);
    }
}
