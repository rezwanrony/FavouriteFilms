package com.example.azer.favouritefilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.azer.favouritefilms.adapter.CustomAdapter;

public class Shahrukh_activity extends AppCompatActivity {
ListView lv_moviename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shahrukh_activity);
        String[]moviename={"Dilwale Dulhania Le Jayenge","Kuch Kuch Hota Hai","Kabhi Khushi Kabhi gham","Hum Tumhare Hain Sanam","Main Hoon Na","My Name Is Khan","Don","Baazigar","Dilwale","Om Shanti Om","Fan"};
        lv_moviename=(ListView)findViewById(R.id.lv_moviename);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,moviename);
        lv_moviename.setAdapter(arrayAdapter);
    }
}
