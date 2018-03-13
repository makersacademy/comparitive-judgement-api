package com.example.makers;

public class CompareContent {
    private String codeSnippetOptionOne;
    private String codeSnippetOptionTwo;

    public String getCodeSnippetOptionTwo() {
        return codeSnippetOptionTwo;
    }

    public void setCodeSnippetOptionTwo(String codeSnippetOptionTwo) {
        this.codeSnippetOptionTwo = codeSnippetOptionTwo;
    }

    public String getCodeSnippetOptionOne() {
        return codeSnippetOptionOne;
    }

    public void setCodeSnippetOptionOne(String codeSnippetOptionOne) {
        this.codeSnippetOptionOne = codeSnippetOptionOne;
    }

    public CompareContent(String codeSnippetOptionOne, String codeSnippetOptionTwo) {
        this.codeSnippetOptionOne = codeSnippetOptionOne;
        this.codeSnippetOptionTwo = codeSnippetOptionTwo;
    }
}
