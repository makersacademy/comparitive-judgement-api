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
        optionOne = new CodeSnippet(1, "img");
        optionTwo = new CodeSnippet(2, "img");
        content = new CompareContent(5, optionOne, optionTwo);
    }

    @Test
    public void hasCodeSnippets() {
        assertFalse(content.getChoices().isEmpty());
        assertEquals(content.getChoices().size(), 2);
    }

//    @Test
//    public void setCodeSnippetOptionTwo() {
//        content.setCodeSnippetOptionTwo("Img3");
//        assertEquals(content.getCodeSnippetOptionTwo(), "Img3");
//    }
//
//    @Test
//    public void getCodeSnippetOptionOne() {
//        assertEquals(content.getCodeSnippetOptionOne(), "Img1");
//    }
//
//    @Test
//    public void setCodeSnippetOptionOne() {
//        content.setCodeSnippetOptionOne("Img5");
//        assertEquals(content.getCodeSnippetOptionOne(), "Img5");
//    }
//
//    @Test
//    public void testingBeforeEach() {
//        assertNotEquals(content.getCodeSnippetOptionOne(), "Img5");
//        assertNotEquals(content.getCodeSnippetOptionTwo(), "Img3");
//    }
}