package com.example.training;

import android.media.Image;

import java.util.ArrayList;

public class App {
    private String appname;
    private String description;
    private int image;

    public App(String name, String desc, int img) {
        appname = name;
        description = desc;
        image = img;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
