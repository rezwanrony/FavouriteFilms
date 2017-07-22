package com.example.azer.favouritefilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ajay_activity extends AppCompatActivity {
    ListView lv_moviename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajay_activity);
        String[]moviename={"Hum Dil De Chuke Sanam","Taarzan: The Wonder Car","Golmaal Returns","Atithi Tum Kab Jaoge?","Golmaal 3","Singham","Bol Bachchan","Son Of Sardaar","Singham Returns","Action Jackson","Shivaay"};
        int[]releaseyear={1999,2004,2008,2010,2010,2011,2012,2012,2014,2014,2016};
        lv_moviename=(ListView)findViewById(R.id.lv_moviename);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,moviename);
        lv_moviename.setAdapter(arrayAdapter);
        lv_moviename.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
