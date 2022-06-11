package org.wecancodeit.reviewsitemvcjalynjenkins;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ShoeRepository {

    Map<Long, Shoe> shoeList = new HashMap<>();

    public ShoeRepository() {
        Shoe jordanOne = new Shoe(1L, "Nike Air Jordan 1", "");
        Shoe jordanTwo = new Shoe(2L, "Nike Air Jordan 2", "");
        Shoe jordanThree = new Shoe(3L, "Nike Air Jordan 3", "");

        shoeList.put(jordanOne.getId(), jordanOne);
        shoeList.put(jordanTwo.getId(), jordanTwo);
        shoeList.put(jordanThree.getId(), jordanThree);

    }


    public ShoeRepository(Shoe... shoesToAdd) {
        for (Shoe shoe : shoesToAdd) {
            shoeList.put(shoe.getId(), shoe);
        }

    }

    public Shoe findOne(long id) {
        return shoeList.get(id);
    }


    public Collection<Shoe> findAll() {
        return shoeList.values();
    }
}