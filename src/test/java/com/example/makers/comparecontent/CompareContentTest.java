package com.example.makers.comparecontent;

import com.example.makers.codesnippet.CodeSnippet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareContentTest {
    private CompareContent content;
    private CodeSnippet optionOne;
    private CodeSnippet optionTwo;

    @Before
    public void beforeEachTest() {
        optionOne = new CodeSnippet(1, "img1");
        optionTwo = new CodeSnippet(2, "img2");
        content = new CompareContent(5, optionOne, optionTwo);
    }

    @Test
    public void hasCodeSnippets() {
        assertFalse(content.getChoices().isEmpty());
        assertEquals(content.getChoices().size(), 2);
    }
    @Test
    public void hasCorrectImageofCodeSnippet() {
        assertEquals(content.getChoices().get(0).getImage(), "img1");
        assertEquals(content.getChoices().get(1).getImage(), "img2");
    }
}
