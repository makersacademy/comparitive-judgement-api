package com.example.makers.controllers;

import com.example.makers.codesnippet.CodeSnippet;
import com.example.makers.comparecontent.CompareContent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;


import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringJUnit4ClassRunner.class)
public class ComparativeControllerTest {

    private MockMvc mockMvc;
    private CompareContent content;
    private CodeSnippet optionOne;
    private CodeSnippet optionTwo;

    @Before
    public void setup(){
        this.mockMvc = standaloneSetup(new ComparativeController()).build();

        optionOne = new CodeSnippet(1, "img1");
        optionTwo = new CodeSnippet(2, "img2");
        ArrayList<CodeSnippet> snippets = new ArrayList<>();
        snippets.add(optionOne);
        snippets.add(optionTwo);
        content = new CompareContent(5, snippets, optionOne);
    }

    @Test
    public void getContentRoute() throws Exception {
        String resBody = "{\"id\":5,\"choices\":[{\"id\":1,\"img\":\"img1\"},{\"id\":2,\"img\":\"img2\"}],\"chosenChoice\":null}";
        this.mockMvc.perform(get("/compare"))
                .andExpect(status().isOk())
                .andExpect(content().json(resBody));
    }

    @Test
    public void postContentRoute() throws Exception {
        //Covert object to Json
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        this.mockMvc.perform(post("/compare")
                .header("Accept", "application/json")
                .content(mapper.writeValueAsBytes(content))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":5,\"choices\":[{\"id\":1,\"img\":\"img1\"},{\"id\":2,\"img\":\"img2\"}],\"chosenChoice\":{\"id\":1,\"img\":\"img1\"}}"));
    }

}
