package com.example.laundryyuk.model;

public class MainMenuItem {
    private int color;
    private String title;
    private int image;

    public MainMenuItem(int color, String title, int image) {
        this.color = color;
        this.title = title;
        this.image = image;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
