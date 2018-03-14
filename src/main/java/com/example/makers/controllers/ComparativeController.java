package com.example.makers.controllers;

import com.example.makers.codesnippet.CodeSnippet;
import com.example.makers.comparecontent.CompareContent;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class ComparativeController {

    @RequestMapping(path="/compare", method= RequestMethod.GET)
    CompareContent getContent(){
        CodeSnippet optionOne = new CodeSnippet(1, "img1");
        CodeSnippet optionTwo = new CodeSnippet(2, "img2");
        ArrayList<CodeSnippet> snippets = new ArrayList<CodeSnippet>();
        snippets.add(optionOne);
        snippets.add(optionTwo);
        CompareContent content = new CompareContent(5,  snippets, null);
        return content;
    }

    @RequestMapping(path="/compare", method= RequestMethod.POST)
    CompareContent postContent(@RequestBody CompareContent content){
        return content;
    }
}
