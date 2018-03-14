package com.example.makers.codesnippet;

public class CodeSnippet {
    private int id;
    private String img;

    public CodeSnippet(int id, String img) {
        this.id = id;
        this.img = img;
    }

    public String getImage() {
        return img;
    }

    public int getId() {
        return id;
    }
}
