/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class SortieConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calcul;
        calcul = 1+2*3;
        System.out.println(calcul);
        System.out.println("Poule raptor.");
        System.out.println(1+2*3);
        
        int carre = 3*3;
        System.out.println("Le carré de 3 est : "+carre);
        System.out.println(MathUtil.exposant(3, 3));
        System.out.println(MathUtil.factorielle(10));
        System.out.println(MathUtil.factorielleRecursive(10, 10));
        System.out.println(MathUtil.aleatoire(10, 20));
        System.out.println(MathUtil.aleatoireWhile(10, 20));
        
    }
    
}
