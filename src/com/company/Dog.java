package com.company;

public class Dog extends Animal {
    private boolean chipirovan;

    public Dog(String name, String poroda, int age, boolean isMan, boolean chipirovan, String animaltype) {
        super(name, poroda, age, isMan);
        this.chipirovan = chipirovan;
        setAnimalType(animaltype);
    }

    @Override
    public String fullInfo() {
        if (chipirovan) {
            return "Чипирован: Да";
        } else {
            return "Чипирован: Нет";
        }
    }

    @Override
    public boolean isCipirovan() {
        return chipirovan;
    }
}
