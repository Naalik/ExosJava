/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuPaires {

    public static void main(String[] args) throws IOException {
        int n = JeuPaires.moulinetteSaisie();
        char[][] plateauVisible = JeuPaires.generePlateauVisible(n);
        char[][] plateauReponse = JeuPaires.genererPlateauReponse(n);
        JeuPaires.afficherPlateau(plateauVisible);
        //System.out.println(plateau.length);
        //System.out.println(taillePlateau);
    }

    /**
     * Saisie de n et vérifie si n respecte les règles du jeu (n² pair et inf
     * ou egal au max) boucle si pas legit
     *
     * @return
     */
    public static Integer moulinetteSaisie() throws IOException {
        int entier = 0;
        boolean legit = false;
        int resModulo = 1;
        while (legit == false) {
            String txt = ConsoleUtil.lireTexte("Taille du tableau :");
            entier = Integer.valueOf(txt);
            resModulo = (entier*entier) % 2;
            if (resModulo == 0 && ((entier*entier)/2) < 27){
                legit = true;
            }else{
                System.out.println("Ce nombre ne convient pas.");
            }
        }
        return entier;
    }

    /**
     * Initialisation du plateau visible
     *
     * @param n
     * @return char[][]
     */
    public static char[][] generePlateauVisible(int n) {
        char[][] plateauVisible = new char[n][n];
        for (int i = 0; i < plateauVisible.length; i++) {//i : row
            for (int j = 0; j < plateauVisible.length; j++) {//j : column
                plateauVisible[i][j] = '?';
            }
        }
        return plateauVisible;
    }

    /**
     * Génération du set de char aléatoire puis remplissage du plateau réponse
     *
     * @param n
     * @return char[][]
     */
    public static char[][] genererPlateauReponse(int n) {
        char[][] plateauReponse = new char[n][n];
        int taillePlateau = n * 2;
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] selection = new char[taillePlateau - 1];
        for (int i = 0; i < taillePlateau; i++) {
            selection[i] = str.charAt(MathUtil.aleatoire(0, 25));
        }
        return plateauReponse;
    }

    /**
     * Affichage du plateau
     *
     * @param plateau
     */
    public static void afficherPlateau(char[][] plateau) {
        for (char[] rowAct : plateau) {
            for (char colAct : rowAct) {
                System.out.print(colAct);
            }
            System.out.print("\n");
        }
    }
}
