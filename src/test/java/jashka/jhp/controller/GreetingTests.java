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
class GreetingTests {

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
    void greeting1WithNameHhhJsonTest()  throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greeting1?name=greet1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Hello 1, greet1!"));
    }

    @Test
    void greeting2WithName2JsonTest()  throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greeting2?name=greet2").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Hello 2, greet2!"));
    }

    @Test
    void greeting3WithNameJsonTest()  throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greeting3?name=greet3").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Hello 3, greet3!"));
    }

    @Test
    void greeting4WithNameJsonTest()  throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greeting4?name=greet4").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Hello 4, greet4!"));
    }

}
