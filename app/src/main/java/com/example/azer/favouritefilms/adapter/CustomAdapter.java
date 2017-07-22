package com.example.azer.favouritefilms.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.azer.favouritefilms.R;
import com.example.azer.favouritefilms.Shahrukh_activity;
import com.example.azer.favouritefilms.model.Actor;

import java.util.ArrayList;

/**
 * Created by azeR on 11/29/2016.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Actor> actorArrayList;

    public CustomAdapter(Context context, ArrayList<Actor> actorArrayList) {
        this.context = context;
        this.actorArrayList = actorArrayList;
    }



    public int getCount() {
        return actorArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return actorArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
         convertView=LayoutInflater.from(context).inflate(R.layout.actorwithphoto,parent,false);
        }
        TextView actorname=(TextView)convertView.findViewById(R.id.tvActorname);
        ImageView actorimage=(ImageView)convertView.findViewById(R.id.imgactor);
        actorname.setText(actorArrayList.get(position).getActorname());
        actorimage.setImageResource(actorArrayList.get(position).getImages());
        return convertView;
    }
}
