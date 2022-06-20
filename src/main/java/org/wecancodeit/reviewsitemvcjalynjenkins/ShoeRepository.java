package org.wecancodeit.reviewsitemvcjalynjenkins;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ShoeRepository {

    Map<Long, Shoe> shoeList = new HashMap<>();

    public ShoeRepository() {
        Shoe jordanOne = new Shoe(1L, "Nike Air Jordan 1", "Modern sneaker culture had its roots in the air; that is, the original Air Jordan that released in 1985. Nike, and subsequently the Jordan Brand, has honored this iconic silhouette numerous times since with releases of the Retro 1. The NBA banned the original Air Jordan for not meeting the league's stringent policy on uniforms and colors. Jordan wore them anyway and faced a $5,000-per-game fine as a result. Recognizing a unique marketing opportunity when it presented itself, Nike happily paid the fine. And MJ rocked them all the way to his Rookie of the Year honor. ", 1985, "Peter Moore", 65, 180);
        Shoe jordanTwo = new Shoe(2L, "Nike Air Jordan 2", "Nike faced a unique challenge following the unprecedented success of the original Air Jordan; how to follow it up. The popularity of the shoe's namesake, Michael Jordan, already had begun outgrowing his home country, and Nike went to Italy to produce the Air Jordan II. Known among sneaker collectors as the first \"luxury\" basketball shoe, the AJ II paved the way for the heat that would accompany the Air Jordan III. ", 1986, "Bruce Kilgore", 100, 190);
        Shoe jordanThree = new Shoe(3L, "Nike Air Jordan 3", "f the basketball world was still getting to know Michael Jordan, the ad campaign surrounding the Air Jordan III introduced one prominent playground baller who knew MJ, and MJ's increasingly prominent shoes, all too well.\n" +
                "\n" +
                "Released in 1988, the rollout of the AJ III included TV spots featuring actor/director Spike Lee as Mars Blackmon, from his 1986 film \"She's Gotta Have It\" sparking a series of catch phrases heard 'round the sneaker world.", 1988, "Tinker Hatfield", 100, 190);
        Shoe jordanFour = new Shoe(4L, "Nike Air Jordan 4", "Following the success of the Air Jordan III, designer Tinker Hatfield delivered one of the more comfortable Air Jordans in the series, the Air Jordan IV.Mars Blackmon returned to the ad campaign marketing the shoe, continuing a relationship that has continued - to varying degrees - well into the 21st century.\n" +
                "\n" +
                "Ten years after its original release, Nike retro'd the AJ IV in 1999; it sold out immediately. ", 1989, "Tinker Hatfield", 110, 190 );
        Shoe jordanFive = new Shoe(5L, "Nike Air Jordan 5", "The Air Jordan V was a statement of Michael Jordan's aggressive nature on the court. Released in February 1990 for $125, the AJ V featured a sharktooth design on the lateral (outer) midsole that designer Tinker Hatfield drew from a World War II P-51 Mustang fighter plane. The Grape Purple/Emerald colorway was the first time those colors had appeared on a basketball shoe. And it brought even further attention to MJ and his sneakers at a time when his game already was turning heads. ", 1990, "Tinker Hatfield", 125, 190);
        Shoe jordanSix = new Shoe (6L, "Nike Air Jordan 6", "The Air Jordan VI is a fixture in basketball history. Released in February 1991, Michael Jordan wore it to the Chicago Bulls' first championship just a few months later.\n" +
                "\n" +
                "While the sports world focused its attention on MJ's emotional first embrace of the coveted Larry O'Brien trophy, with his father looking on proudly, the sneaker world was trying to catch glimpses of what was on his feet.", 1991, "Tinker Hatfield", 125, 190 );

        shoeList.put(jordanOne.getId(), jordanOne);
        shoeList.put(jordanTwo.getId(), jordanTwo);
        shoeList.put(jordanThree.getId(), jordanThree);
        shoeList.put(jordanFour.getId(), jordanFour);
        shoeList.put(jordanFive.getId(), jordanFive);
        shoeList.put(jordanSix.getId(), jordanSix);

    }


    public ShoeRepository(Shoe ...shoeToAdd) {
        for (Shoe shoe : shoeToAdd) {
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