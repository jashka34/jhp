package jashka.jhp.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles(profiles = {"test"})
@WebMvcTest(GreetingController.class)
public class GreetingTests {

    @Autowired private MockMvc mockMvc;

    @Test
    void greetingEmptyJsonTest()  throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greeting").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Hello, World!"));
    }

    @Test
    void greetingWithNameJsonTest()  throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greeting?name=Ivan").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Hello, Ivan!"));
    }

    @Test
    void greetingWithNameHhhJsonTest()  throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greeting?name=Hhh").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Hello, Hhh2!"));
    }

}
