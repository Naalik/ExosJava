/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.ArrayList;
import org.junit.Test;
import test1.classes.Animal;
import test1.classes.Poisson;
import test1.classes.Serpent;
import test1.classes.Tortue;

/**
 *
 * @author admin
 */
public class AnimalTest {

    @Test
    public void animalTest() {
        Animal poisson = new Poisson("Jojo");
        Animal serpent = new Serpent("Juju");
        Animal tortue = new Tortue("Jiji");
        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(poisson);
        animaux.add(serpent);
        animaux.add(tortue);

        for (Animal animal : animaux) {
            animal.manger();
            animal.bouger();
            animal.sleep();
        }
    }

}
