package com.example.myapplication.Models;

public class News {

    private final String text;
    private final String autor;

    private final int authorsAvatarResource;
    private final int imageResource;

    public int getAuthorsAvatarResource() {
        return authorsAvatarResource;
    }

    public News(String text, String autor, int authorsAvatarResource, int imageResource) {
        this.text = text;
        this.autor = autor;
        this.authorsAvatarResource = authorsAvatarResource;
        this.imageResource = imageResource;
    }


    public String getText() {
        return text;
    }

    public String getAutor() {
        return autor;
    }

    public int getImageResource() {
        return imageResource;
    }
}
