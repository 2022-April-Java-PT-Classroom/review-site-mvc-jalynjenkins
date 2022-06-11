package org.wecancodeit.reviewsitemvcjalynjenkins;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ShoeController.class)
    public class ShoeControllerMvcTest {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private ShoeRepository shoeRepo;

        @Mock
        private Shoe shoeOne;

        @Mock
        private Shoe shoeTwo;

        @Mock
        private Shoe shoeThree;

        @Test
        public void shouldBeOkForAllShoesInTheShoesTemplate() throws Exception {
            mockMvc.perform(get("/shoes")).andExpect(status().isOk())
                    .andExpect(view().name("shoesTemplate"));
        }

    @Test
    public void shouldFindAllShoesInModel() throws Exception {
        Collection<Shoe> allShoesInModel = Arrays.asList(shoeOne, shoeTwo);
        when(shoeRepo.findAll()).thenReturn(allShoesInModel);
        mockMvc.perform(get("/shoes"))
                .andExpect(model().attribute("shoesModel", allShoesInModel));
    }

    @Test
    public void shouldBeOkForOneShoeInTheShoeTemplate() throws Exception {
        mockMvc.perform(get("/shoe?id=1")).andExpect(status().isOk())
                .andExpect(view().name("shoeTemplate"));
    }

    @Test
    public void shouldFindOneShoeInModel() throws Exception {
        Long shoeOneId = 1L;
        when(shoeRepo.findOne(shoeOneId)).thenReturn(shoeOne);
        mockMvc.perform(get("/shoe?id=1"))
                .andExpect(model().attribute("shoeModel", shoeOne));
    }






    }

