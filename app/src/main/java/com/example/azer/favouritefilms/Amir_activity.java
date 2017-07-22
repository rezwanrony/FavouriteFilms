package com.example.azer.favouritefilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Amir_activity extends AppCompatActivity {
    ListView lv_moviename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amir_activity);
        String[]moviename={"3 idiots","Qyamot Se Qyamot Tak","PK","Gajni","Dil","Mann","Taare Jameen Par","Dil Chata Hain","Lagaan"};
        lv_moviename=(ListView)findViewById(R.id.lv_moviename);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,moviename);
        lv_moviename.setAdapter(arrayAdapter);
    }
}
