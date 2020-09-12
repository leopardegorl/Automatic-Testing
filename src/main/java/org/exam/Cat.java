package org.exam;

public class Cat extends Animal {

    public Cat(String name, int age, double price) {
        super(name, age, price);
    }

    public void voice() {
        System.out.println("Myaaaau");
    }

    public void voice(byte catFood) {
        if (catFood < 2) {
            voice();
        } else {
            System.out.println(".......");
        }

    }
}
