package com.example.makers.comparecontent;

import com.example.makers.codesnippet.CodeSnippet;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class CompareContent {
    private int id;
    private ArrayList<CodeSnippet> choices;
    private CodeSnippet chosenChoice;

    public CompareContent() {

    }

    public CompareContent(int id, ArrayList<CodeSnippet> snippets, CodeSnippet choice) {
        this.id = id;
        this.choices = snippets;
        this.chosenChoice = choice;
    }

    public int getId() {
        return id;
    }

    public ArrayList<CodeSnippet> getChoices() {
        return choices;
    }

    public CodeSnippet getChosenChoice() {
        return chosenChoice;
    }

    public void setChosenChoice(CodeSnippet chosenChoice) {
        this.chosenChoice = chosenChoice;
    }
 }
