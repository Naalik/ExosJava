/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author admin
 */
public class SetsTest {
    public static void main(String[] args) {
        HashSet<String> nom = new HashSet<>();
        nom.add("John");
        nom.add("Lennon");
        nom.add("John");
        System.out.println(nom);
        //créer HashSet d'int 1, 2 et 3
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(2);
        //créer ArrayList d'int 1, 2, 3, 3, 4, 4, 5 et 6
        ArrayList<Integer> liste2 = new ArrayList<>();
        liste2.add(1);
        liste2.add(2);
        liste2.add(3);
        liste2.add(3);
        liste2.add(5);
        liste2.add(4);
        liste2.add(4);
        liste2.add(6);
        //ajouter la liste au set
        set1.addAll(liste2);
        //afficher le set
        System.out.println("Affichage du set : "+set1);
        //ajouter le set à la liste
        liste2.addAll(set1);
        //afficher la liste
        System.out.println("Affichage de la liste : "+liste2);
    }
}
