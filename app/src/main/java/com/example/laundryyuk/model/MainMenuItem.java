package com.example.laundryyuk.model;

public class MainMenuItem {
    private int color;
    private String title;
    private int image1;
    private int image2;

    public MainMenuItem(int color, String title, int image1, int image2) {
        this.color = color;
        this.title = title;
        this.image1 = image1;
        this.image2 = image2;
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

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }
}
