package com.example.makers.controllers;

import com.example.makers.codesnippet.CodeSnippet;
import com.example.makers.comparecontent.CompareContent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComparativeController {

    @GetMapping("/compare")
    CompareContent getContent(){
        CodeSnippet optionOne = new CodeSnippet(1, "img1");
        CodeSnippet optionTwo = new CodeSnippet(2, "img2");
        CompareContent content = new CompareContent(5, optionOne, optionTwo);
        return content;
    }

    @PostMapping("/compare")
    CompareContent postContent(){
        CodeSnippet optionOne = new CodeSnippet(1, "img1");
        CodeSnippet optionTwo = new CodeSnippet(2, "img2");
        CompareContent content = new CompareContent(5, optionOne, optionTwo);
        content.setChosenChoice(optionTwo);
        return content;
    }


}
