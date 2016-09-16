/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ArrayListMixte {

    public static void main(String[] args) {
        //liste avec A, B, 1, true, Coucou, 4, 5 et 6
        ArrayList liste1 = new ArrayList<>();
        liste1.add("A");
        liste1.add("B");
        liste1.add(1);
        liste1.add(true);
        liste1.add("Coucou");
        liste1.add(4);
        liste1.add(5);
        liste1.add(6);
        //liste 2 typée int de 0 à 9 crée avec boucle
        ArrayList<Integer> liste2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            liste2.add(i);
        }
        //retirer liste 2 de liste 1
        liste1.removeAll(liste2);
        //afficher liste 1
        System.out.println(liste1 + " - Nombre d'éléments : " + liste1.size());
        System.out.println(liste2 + " - Nombre d'éléments : " + liste2.size());
    }
}
