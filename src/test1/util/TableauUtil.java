/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

/**
 *
 * @author admin
 */
public class TableauUtil {

    public static void main(String[] args) {
        int[] tab = new int[10];
        //tab[0] = 1;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i+1;
        }

        for (int elemAct : tab) {//equivalent du foreach pour java
            System.out.println(elemAct);
        }
        
        int[][] plateau = new int[3][3];
    }
}
