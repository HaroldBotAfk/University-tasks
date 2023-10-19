package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

public class AnimalFactory {

    /**
     * Метод для создания животных по типу
     *
     * @param name - имя животного
     * @param type - тип животного
     * @return животное, соответствующее каждому из типов.
     */

    static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "meow";
        }
    }

    static class Cow extends Animal {
        public Cow(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "moo";
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public String sound() {
            return "woof";
        }
    }


    public static Animal createAnimal(String name, AnimalType type) {
        Animal animal;
        switch (type) {
            case CAT -> animal = new Cat(name);
            case DOG -> animal = new Dog(name);
            case COW -> animal = new Cow(name);
            default -> animal = null;
        }

        return animal;
    }
}
