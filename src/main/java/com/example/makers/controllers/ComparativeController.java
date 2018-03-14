package com.example.makers.controllers;

import com.example.makers.comparecontent.CompareContent;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComparativeController {

    @RequestMapping("/")
    String getContent(){
        return "{codeSnippetOne:img1, codeSnippetTwo:img2}";
    }


}
