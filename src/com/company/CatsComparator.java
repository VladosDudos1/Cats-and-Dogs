package com.company;

import java.util.Comparator;

public class CatsComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAnimalType().equals("Кошка") && !o1.isMan()) {
            return -1;
        } else if (o1.getAnimalType().equals("Собака") || o1.isMan()) {
            return 1;
        } else {
            return 0;
        }
    }

}
