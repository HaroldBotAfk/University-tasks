package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private final List<Animal> animalList = new ArrayList<>();

    public void addAnimal(String name, AnimalType animal) {
        animalList.add(AnimalFactory.createAnimal(name, animal));
    }

    /**
     * Метод должен возвращать список звуков животных.
     * Звуки животных должны быть отсортированы по имени житного. Пример
     * Животные:
     * <p>
     * Корова: Яша
     * Кошка: Дуся
     * Собака: Жучка
     * Корова: Абракадабра
     * Собака: Шарик
     * Кошка: Мурзик
     * Собака: Бобик
     * <p>
     * Вовращаемый список звуков: moo, woof, meow, woof, meow, woof, moo
     *
     * @return Звуки животных, в алфавитном порядке имени животного.
     */
    public List<String> soundAllAnimalsSortByName() {
        List<String> sounds = new ArrayList<>();
        Comparator<Animal> comparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getName().compareTo(animal2.getName());
            }
        };

        animalList.sort(comparator);
        for (Animal item : animalList) {
            sounds.add(item.sound());
        }
        return sounds;
    }


}
