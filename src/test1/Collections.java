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
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("paupiette");
        liste.add("jambon");
        liste.add("saucisse");
        liste.add("roti");
        for (String elemAct : liste) {
            System.out.println(elemAct);
        }
        System.out.println(liste+" "+liste.size());
        liste.remove("roti");
        System.out.println(liste+" "+liste.size());
        
    }
    
}
