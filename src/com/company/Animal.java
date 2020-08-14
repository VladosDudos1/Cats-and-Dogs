package com.company;

abstract public class Animal {

    private String name;
    private String poroda = "";
    private int age;
    private boolean isMan;
    private String animalType = "";


    public Animal(String name, String poroda, int age, boolean isMan) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public int getAge() {
        return age;
    }

    public boolean isMan() {
        return isMan;
    }

    public String getGender() {
        if (isMan) {
            return "Мальчик";
        } else {
            return "Девочка";
        }
    }

    abstract public String fullInfo();

    @Override
    public String toString() {
        return this.getName() + "\n\tВозраст: " +
                this.getAge() + "\n\tПол: " +
                this.getGender() + "\n\t" + this.fullInfo() + "\n\n";
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    abstract public boolean isCipirovan();
}
