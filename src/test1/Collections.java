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
        ArrayList<Integer> liste1 = new ArrayList<Integer>();
        ArrayList<Integer> liste2 = new ArrayList<Integer>();
        ArrayList<Integer> liste3 = new ArrayList<Integer>();
        for (int i=1;i<11;i++){
            liste1.add(i*10);
        }
        for (int i=1;i<51;i++){
            liste2.add(i*2);
        }
        for (int i=1;i<34;i++){
            liste3.add(i*3);
        }
        liste2.removeAll(liste1);
        liste2.removeAll(liste3);
        System.out.println(liste2+" - Nombre d'éléments : "+ liste2.size());
    }
}
