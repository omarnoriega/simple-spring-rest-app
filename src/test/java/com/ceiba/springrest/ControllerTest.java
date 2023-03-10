package com.ceiba.springrest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @DisplayName("Cuando se llama el servicio saybye el estado es 200")
    @Test
    public void saybyeTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/saybye"))
                        .andDo(print())
                        .andExpect(status().isOk())
                        .andExpect(content().string("Good Bye!"));

    }

    @Test
    @DisplayName("Cuando se llama el servicio sayhello el estado es 200")
    public void sayhelloTest() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/sayhello"))
                        .andDo(print())
                        .andExpect(status().isOk())
                        .andExpect(content().string("Hello, World!"));



    }

}
