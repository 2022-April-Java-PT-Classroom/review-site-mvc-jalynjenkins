package org.wecancodeit.reviewsitemvcjalynjenkins;

public class Shoe {

    private long id;
    private String name;
    private String description;
    private int year;
    private String designer;
    private int ogPrice;
    private int nwPrice;

    public Shoe(long id, String name, String description, int year, String designer, int ogPrice, int nwPrice) {
        this.id= id;
        this.name= name;
        this.description= description;
        this.year= year;
        this.designer= designer;
        this.ogPrice= ogPrice;
        this.nwPrice= nwPrice;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear(){ return year;}

    public String getDesigner() { return designer;}

    public int getOgPrice(){ return ogPrice;}

    public int getNwPrice(){ return nwPrice;}
}


