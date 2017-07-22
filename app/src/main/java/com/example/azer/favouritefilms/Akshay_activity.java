package com.example.azer.favouritefilms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Akshay_activity extends AppCompatActivity {
    ListView lv_moviename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akshay_activity);
        String[]moviename={"Khiladi","Hera Pheri","Khiladi 420","Garam Masala","Humko Deewana Kar Gaye","Phir Hera Pheri","Namastey London","Bhagam Bhag","Heyy Babyy","Welcome","Singh Is Kinng","Chandni Chowk to China","De Dana Dan","Housefull","Tees Maar Khan","Patiala House","Housefull 2","Khiladi 786","Housefull 3"};
        int[]releaseyear={};
        lv_moviename=(ListView)findViewById(R.id.lv_moviename);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,moviename);
        lv_moviename.setAdapter(arrayAdapter);
    }
}
