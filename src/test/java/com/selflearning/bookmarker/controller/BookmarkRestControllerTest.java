package com.selflearning.bookmarker.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class BookmarkRestControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldGetALlBookmarks() throws Exception{

        mvc.perform(get("/api/bookmarks/getAllBookmarks"))
                .andExpect(status().isOk());
    }
}
