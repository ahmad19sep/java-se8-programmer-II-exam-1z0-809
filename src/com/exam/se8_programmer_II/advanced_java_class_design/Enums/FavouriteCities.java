package com.exam.se8_programmer_II.advanced_java_class_design.Enums;

public enum FavouriteCities {
    Amsterdam(1, "Netherlands"),
    Lisbon(2, "Portugal"),
    New_York(3, "USA"),
    Muscat(4, "Oman"),
    Venice(5, "Italy"),
    Cape_Town(6, "South Africa"),
    DUBAI(7, "UAE"),
    Paris(8, "France"),
    Barcelona(9, "Spain"),
    LONDON(10, "ENGLAND");
    final int list;
    final String country;

    public int getList() {
        return list;
    }

    public String getCountry() {
        return country;
    }

    FavouriteCities(int topList, String countries) {
        this.country = countries;
        this.list = topList;
    }

}

class EnumTest {
    private String favouriteCity;

    public String getFavouriteCity() {
        return favouriteCity;
    }

    public void setFavouriteCity(String favouriteCity) {
        this.favouriteCity = favouriteCity;
    }

    public static void main(String[] args) {
        EnumTest person1 = new EnumTest();
person1.setFavouriteCity("New_York");
        for (FavouriteCities city : FavouriteCities.values()) {
            if (person1.getFavouriteCity().equals(city.toString())) {
                System.out.printf("Your favourite city %s located in %s. \n " +
                        "%s is the %d beautiful city in the world.", city, city.getCountry(),
                        city,city.getList());
            }
        }
    }
}
/**
 * OUTPUT.......
 * Your favourite city New_York located in USA.
 *  New_York is the 3 beautiful city in the world.
 */