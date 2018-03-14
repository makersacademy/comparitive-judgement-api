package com.example.makers.comparecontent;

import com.example.makers.codesnippet.CodeSnippet;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class CompareContent {
    private int id;
    private ArrayList<CodeSnippet> choices;
    private CodeSnippet chosenChoice;

    public CompareContent(int id, CodeSnippet codeSnippetOptionOne, CodeSnippet codeSnippetOptionTwo) {
        this.id = id;
        this.choices = new ArrayList<>();
        this.choices.add(codeSnippetOptionOne);
        this.choices.add(codeSnippetOptionTwo);
    }

    public ArrayList<CodeSnippet> getChoices() {
        return choices;
    }
 }







