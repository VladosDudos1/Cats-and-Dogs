package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик", "", 2, true, 0, "Кошка");
        Cat cat2 = new Cat("Eva", "", 4, false, 6, "Кошка");
        Cat cat3 = new Cat("Kokos", "", 3, false, 5, "Кошка");
        Cat cat4 = new Cat("Simba", "", 1, true, -43, "Кошка");

        Dog dog1 = new Dog("Levi", "", 3, true, true, "Собака");
        Dog dog2 = new Dog("Buch", "", 5, true, false, "Собака");
        Dog dog3 = new Dog("Rex", "", 3, false, false, "Собака");
        Dog dog4 = new Dog("Паша", "", 6, false, true, "Собака");


        Animal[] animals = {cat1, cat2, cat3, cat4, dog1, dog2, dog3, dog4};


        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        System.out.println("---------------------------------");

        Comparator<Animal> myComparator = new AgeComparator();
        Arrays.sort(animals, myComparator);
        System.out.println("\n\n" + Arrays.toString(animals).replace("[", "").replace("]", "").replace(",", ""));

        Comparator<Animal> comparatorType = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.getAnimalType().equals("Кошка")) {
                    return -1;
                }
                if (o1.getAnimalType().equals("Собака")) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        System.out.println("---------------------------------");
        Arrays.sort(animals, comparatorType);
        System.out.println("\n\n" + Arrays.toString(animals).replace("[", "").replace("]", "").replace(",", ""));


        Comparator<Animal> comparatorChip = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.isCipirovan()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        System.out.println("---------------------------------");
        Arrays.sort(animals, comparatorChip);
        System.out.println("\n\n" + Arrays.toString(animals).replace("[", "").replace("]", "").replace(",", ""));

        Comparator<Animal> comparatorAlphabet = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.getName().charAt(0) < o2.getName().charAt(0)) {
                    return -1;
                }
                else if (o1.getName().charAt(0) > o2.getName().charAt(0)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        System.out.println("---------------------------------");
        Arrays.sort(animals, comparatorAlphabet);
        System.out.println("\n\n" + Arrays.toString(animals).replace("[", "").replace("]", "").replace(",", ""));

        Comparator<Animal> catsComparator = new CatsComparator();

        System.out.println("---------------------------------");
        Arrays.sort(animals, catsComparator);
        System.out.println("\n\n" + Arrays.toString(animals).replace("[", "").replace("]", "").replace(",", ""));
    }
}
