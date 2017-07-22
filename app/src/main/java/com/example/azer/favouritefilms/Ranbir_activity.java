package com.example.azer.favouritefilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ranbir_activity extends AppCompatActivity {
    ListView lv_moviename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranbir_activity);
        String[]moviename={"Sawariyan","Bachna e hasino","Wake Up Sid","Ajab Prem Ki Ghazab Kahani","Anjaana Anjaani","Rockstar","Barfi!","Yeh Jawaani Hai Deewani","Besharam"};
        lv_moviename=(ListView)findViewById(R.id.lv_moviename);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,moviename);
        lv_moviename.setAdapter(arrayAdapter);

    }
}
