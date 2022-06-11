package org.wecancodeit.reviewsitemvcjalynjenkins;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoeRepositoryTest {

@Test
    public void shouldFindShoeOne(){
    Shoe shoeOne = new Shoe (1L, "shoe one name", "description" );
    ShoeRepository underTest = new ShoeRepository(shoeOne);
    Shoe foundShoe = underTest.findOne(1L);
    assertEquals(foundShoe, shoeOne);
}

@Test
    public void shouldFindShoeOneAndShoeTwo(){
    Shoe shoeOne = new Shoe(1L, "shoe one name", "description");
    Shoe shoeTwo = new Shoe(2L, "shoe two name", "description");
    ShoeRepository underTest = new ShoeRepository(shoeOne, shoeTwo);
    Collection<Shoe> foundShoes = underTest.findAll();
    assertThat(foundShoes).contains(shoeOne, shoeTwo);
}

}

