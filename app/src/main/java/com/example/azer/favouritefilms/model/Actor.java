package com.example.azer.favouritefilms.model;

/**
 * Created by azeR on 11/29/2016.
 */

public class Actor {
    private String actorname;
    private int images;

    public Actor(String actorname,int images) {
        this.actorname = actorname;
       this.images = images;
    }

    public String getActorname() {
        return actorname;
    }

    public void setActorname(String actorname) {
        this.actorname = actorname;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
