package com.example.sakshi.gridview;

/**
 * Created by Sakshi on 07-May-17.
 */

public class Bean {

    int image;

    public Bean() {
    }

    public Bean(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "image=" + image +
                '}';
    }
}
