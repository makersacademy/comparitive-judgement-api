package com.example.makers.comparecontent;

import com.example.makers.codesnippet.CodeSnippet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CompareContentTest {
    private CompareContent content;
    private CodeSnippet optionOne;
    private CodeSnippet optionTwo;

    @Before
    public void beforeEachTest() {
        optionOne = new CodeSnippet(1, "img1");
        optionTwo = new CodeSnippet(2, "img2");
        ArrayList<CodeSnippet> snippets = new ArrayList<>();

        snippets.add(optionOne);
        snippets.add(optionTwo);

        content = new CompareContent(5, snippets, null);
    }

    @Test
    public void hasCodeSnippets() {
        assertFalse(content.getChoices().isEmpty());
        assertEquals(content.getChoices().size(), 2);
    }
    @Test
    public void hasCorrectImageofCodeSnippet() {
        assertEquals(content.getChoices().get(0).getImg(), "img1");
        assertEquals(content.getChoices().get(1).getImg(), "img2");
    }
}
