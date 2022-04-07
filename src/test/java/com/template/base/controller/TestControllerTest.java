package com.template.base.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestPropertySource(locations="classpath:test.properties")
@DisplayName("Communication Controller Unit Test Case")
@AutoConfigureMockMvc
public class TestControllerTest {

    @Autowired
    private TestController testController;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void save() throws Exception {
        mockMvc.perform(get("/save")
                )
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void test() throws Exception {
        //Mockito.verify(Mockito.times(1));
        mockMvc.perform( MockMvcRequestBuilders
                        .get("/save")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        //demoController.test();
    }
}
