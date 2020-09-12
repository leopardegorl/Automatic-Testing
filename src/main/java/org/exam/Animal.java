package org.exam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Animal implements Ivoice {
    protected final String name;
    protected int age;
    protected double price;

    public Animal(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void voice(byte food);



    @Override
    public String toString() {
        return "Animal {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", price = " + price +
                '}';
    }
}
