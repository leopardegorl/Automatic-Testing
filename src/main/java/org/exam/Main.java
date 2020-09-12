package org.exam;

public class Main {
    public static void main(String[] args) {
        PetShop petshop = new PetShop(); // Создаю магазин
        Man man = new Man("Bruce", 23); //Создаю мужичка по имени Брюс
        man.setDollarsInPocket(70000); // Устанавливаю в его кошельке сумму, которую он готов потратить на пушистых засранцев
        petshop.sell(man, petshop.getAnimal(AnimalType.CAT)); // Брюс пытается купить кота
        System.out.println(petshop.getAnimal(AnimalType.CAT)); // Проверяю остался ли в магазине кот
    }
}
