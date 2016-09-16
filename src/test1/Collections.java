/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 * Exercice sur les collections
 * @author admin
 */
public class Collections {
    public static void main(String[] args) {
        // 3 ArrayList ont été créées
        ArrayList<Integer> liste1 = new ArrayList<>();
        ArrayList<Integer> liste2 = new ArrayList<>();
        ArrayList<Integer> liste3 = new ArrayList<>();
        //une avec les multiples de 10 jusqu'à 100
        for (int i=1;i<11;i++){
            liste1.add(i*10);
        }
        //une avec les multiples de 2 jusqu'à 100
        for (int i=1;i<51;i++){
            liste2.add(i*2);
        }
        //une avec les multiples de 3 jusqu'à 99
        for (int i=1;i<34;i++){
            liste3.add(i*3);
        }
        //on enlève les listes 1 et 3 de la 2 et on affiche la 2
        liste2.removeAll(liste1);
        liste2.removeAll(liste3);
        System.out.println(liste2+" - Nombre d'éléments : "+ liste2.size());
    }
}
