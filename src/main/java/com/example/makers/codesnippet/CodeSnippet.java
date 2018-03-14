package com.example.makers.codesnippet;

public class CodeSnippet {
    private int id;
    private String img;

    public CodeSnippet() {

    }

    public CodeSnippet(int id, String img) {
        this.id = id;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public int getId() {
        return id;
    }
}
