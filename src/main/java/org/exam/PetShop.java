package org.exam;

public class PetShop {
    private Animal dog = new Dog("Reks", 4, 111);
    private Animal cat = new Cat("Brasik", 2, 1000);

    public PetShop() {
        System.out.println("Welcome to our petshop");
        System.out.println("We have dogs and cats");
    }

    public Animal getAnimal(AnimalType type) {
        switch (type) {
            case CAT:
                return cat;
            case DOG:
                return dog;
            default:
                throw new RuntimeException("wrong type of animal");
        }

    }

    public void sell(Man man, Animal pet) {
        if (man.getDollarsInPocket() > pet.getPrice()) {
            System.out.println("У вас достаточно dollars для покупки");
            if (pet instanceof Cat) {
                this.cat = null;
            } else {
                this.dog = null;
            }
            man.setPet(pet);
        } else {
            System.out.println("Недостаточно dollars для покупки");
        }

    }
}
