package com.example.azer.favouritefilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Salman_activity extends AppCompatActivity {
    ListView lv_moviename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salman_activity);
        String[]moviename={"Tere Naam","Maine Pyaar Kiya","Kyon Ki","Chori Chori Chupke Chupke","Pyaar Kiya To Darna Kiya","Hum Tumhare Hain Sanam","Hum Dil De Chuke Sanam","Kahin Pyaar Na Ho Jaye","Mujhse Shadi Karogi","Baajrangi Bhaijaan","Kick","Ready"};
        lv_moviename=(ListView)findViewById(R.id.lv_moviename);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,moviename);
        lv_moviename.setAdapter(arrayAdapter);
    }
}
