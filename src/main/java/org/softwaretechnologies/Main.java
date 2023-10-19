package org.softwaretechnologies;

import org.softwaretechnologies.animals.AnimalType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal("Яша", AnimalType.COW);
        zoo.addAnimal("Дуся", AnimalType.CAT);
        zoo.addAnimal("Жучка", AnimalType.DOG);
        zoo.addAnimal("Абракадабра", AnimalType.COW);
        zoo.addAnimal("Шарик", AnimalType.DOG);
        zoo.addAnimal("Мурзик", AnimalType.CAT);
        zoo.addAnimal("Бобик", AnimalType.DOG);

        List<String> list = zoo.soundAllAnimalsSortByName();
        System.out.println(list);


    }
}
