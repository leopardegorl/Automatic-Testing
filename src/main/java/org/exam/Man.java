package org.exam;

public class Man {
    private final String name;
    private int age;
    private Animal pet;
    private double dollarsInPocket;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet){
        this.pet = pet;
        System.out.println(name + " buy " + pet.toString());
    }
    public void setDollarsInPocket (double dollarsInPocket) {
        if (dollarsInPocket < 1) {
            throw new RuntimeException("В кошельке не может быть суммы такого размера, определите внимательнее!");
        }
        this.dollarsInPocket = dollarsInPocket;
    }
    public double getDollarsInPocket () {
        return dollarsInPocket;
    }
}
