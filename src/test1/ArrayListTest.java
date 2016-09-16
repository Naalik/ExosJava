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
public class ArrayListTest {
    public static void main(String[] args) {
        //créer une liste avec 4 prénoms
        ArrayList<String> liste1 = new ArrayList<>();
        liste1.add("John");
        liste1.add("Paul");
        liste1.add("George");
        liste1.add("Ringo");
        //nouvelle liste avec 2 prénoms dont un déjà dans la précédente
        ArrayList<String> liste2 = new ArrayList<>();
        liste2.add("John");
        liste2.add("Yoko");
        //ajouter liste 2 à liste 1
        liste1.addAll(liste2);
        //afficher liste 1
        System.out.println(liste1+" - Nombre d'éléments : "+ liste1.size());
        System.out.println(liste2+" - Nombre d'éléments : "+ liste2.size());
    }
}
