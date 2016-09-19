/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Animal;
import test1.classes.Poisson;

/**
 *
 * @author admin
 */
public class AnimalTest {

    @Test
    public void animalTest() {
        Animal animal1 = new Poisson("Jojo");
        animal1.manger();
    }

}
