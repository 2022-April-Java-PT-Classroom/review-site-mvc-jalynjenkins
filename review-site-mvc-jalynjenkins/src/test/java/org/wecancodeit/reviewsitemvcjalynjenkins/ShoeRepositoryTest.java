package org.wecancodeit.reviewsitemvcjalynjenkins;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoeRepositoryTest {

    private ShoeRepository underTest;
    private Shoe shoeOne = new Shoe(1L, "shoe one name", "description", 1985, "Peter Moore", 85, 180);
    private Shoe shoeTwo = new Shoe(2L, "shoe two name", "description", 1986, "Bruce Kilgore", 100, 190);

    @Test
    public void shouldFindShoeOne(){
    underTest = new ShoeRepository(shoeOne);
    Shoe foundShoe = underTest.findOne(1L);
    assertEquals(shoeOne, foundShoe);
}

@Test
    public void shouldFindShoeOneAndShoeTwo(){
        underTest = new ShoeRepository(shoeOne, shoeTwo);
    Collection<Shoe> foundShoes = underTest.findAll();
    assertThat(foundShoes).contains(shoeOne, shoeTwo);
}

}

