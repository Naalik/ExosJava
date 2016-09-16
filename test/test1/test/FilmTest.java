/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import static org.junit.Assert.*;
import test1.classes.Film;

/**
 *
 * @author admin
 */
public class FilmTest {

    @Test
    public void test1() {
        Film film1 = new Film("Dracula", 120, "blabla", 1990);
        Film film2 = new Film("Pulp Fiction", 120, "blabla", 1990);

        System.out.println(film1);
        System.out.println(film2);
    }

}
