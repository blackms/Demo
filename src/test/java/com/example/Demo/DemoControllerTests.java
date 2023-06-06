package com.example.Demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void demoTest() throws Exception {
        mockMvc.perform(get("/demo"))
                .andExpect(status().isOk())
                .andExpect(content().string("This is a demo"));
    }

    @Test
    public void sayHelloTest() throws Exception {
        mockMvc.perform(get("/sayHello"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().json("{\"message\":\"Hello from the API\"}"));
    }

    @Test
    public void sayByeTest() throws Exception {
        mockMvc.perform(get("/sayBye"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().json("{\"message\":\"Bye from the API\"}"));
    }
}