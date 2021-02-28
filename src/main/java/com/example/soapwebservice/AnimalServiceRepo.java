package com.example.soapwebservice;

import com.animals.soap_zoo_ws.Animal;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class AnimalServiceRepo {
    private static final Map<String, Animal> animals = new HashMap<>();

    @PostConstruct
    public void initData() {
        Animal brownBear = new Animal();
        brownBear.setName("Brown Bear");
        brownBear.setLifespan(15);
        brownBear.setType("Mammal, Omnivore");

        animals.put(brownBear.getName(), brownBear);

        Animal baldEagle = new Animal();
        baldEagle.setName("Bald Eagle");
        baldEagle.setLifespan(30);
        baldEagle.setType("Bird, Raptor");

        animals.put(baldEagle.getName(), baldEagle);

        Animal payingMantis = new Animal();
        payingMantis.setName("Mantis");
        payingMantis.setLifespan(2);
        payingMantis.setType("Insect, Predator");

        animals.put(payingMantis.getName(), payingMantis);

        Animal giraffe = new Animal();
        giraffe.setName("Giraffe");
        giraffe.setLifespan(22);
        giraffe.setType("Mammal, Herbivore");

        animals.put(giraffe.getName(), giraffe);

    }

    public Animal getAnimals(String name) {
        return animals.get(name);
    }
}