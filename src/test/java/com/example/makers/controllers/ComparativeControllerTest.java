package com.example.makers.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.json.JsonParser;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringJUnit4ClassRunner.class)
public class ComparativeControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setup(){
        this.mockMvc = standaloneSetup(new ComparativeController()).build();
    }


    @Test
    public void getContentRoute() throws Exception {
        String resBody = "{\"id\":5,\"choices\":[{\"id\":1,\"image\":\"img1\"},{\"id\":2,\"image\":\"img2\"}],\"chosenChoice\":null}";

        this.mockMvc.perform(get("/compare"))
                .andExpect(status().isOk())
                .andExpect(content().json(resBody));
    }

    @Test
    public void postContentRoute() throws Exception {
        this.mockMvc.perform(post("/compare"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":5,\"choices\":[{\"id\":1,\"image\":\"img1\"},{\"id\":2,\"image\":\"img2\"}],\"chosenChoice\":{\"id\":2,\"image\":\"img2\"}}"));
    }
}
