package com.example.makers.codesnippet;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodeSnippetTest {
    private CodeSnippet option;

    @Before
    public void setUp() throws Exception {
        option = new CodeSnippet(1, "img1");
    }

    @Test
    public void hasImage() {
        assertEquals(option.getImg(), "img1");
    }
}