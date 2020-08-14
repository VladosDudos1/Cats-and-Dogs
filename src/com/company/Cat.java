package com.company;

public class Cat extends Animal {

    private Integer minyCats;

    public Cat(String name, String poroda, int age, boolean isMan, int minyCats, String animaltype) {
        super(name, poroda, age, isMan);
        setAnimalType(animaltype);

        if (isMan) {
            this.minyCats = -1;
        } else {
            this.minyCats = minyCats;
        }
    }

    @Override
    public String fullInfo() {
        return ("Количество котят: " + minyCats.toString());
    }

    @Override
    public boolean isCipirovan() {
        return false;
    }
}
