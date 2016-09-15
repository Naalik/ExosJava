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
public class JeuMorpion {

    public static void main(String[] args) throws IOException {
        char[][] plateau = JeuMorpion.clearPlateau();
        JeuMorpion.afficherPlateau(plateau);
        boolean joueur1 = true;
        boolean caseVide = true;
        boolean partieTerminee = false;
        String joueur;
        char symbole;
        //tant qu'il y a une case vide et que personne ne gagne
        while (caseVide == true && partieTerminee == false) {
            if (joueur1 == true) {
                //joueur 1
                joueur = "Joueur 1";
                symbole = 'x';
                partieTerminee = JeuMorpion.jouerTour(joueur, plateau, symbole);
                caseVide = JeuMorpion.checkPlateauPlein(plateau);
                JeuMorpion.afficherPlateau(plateau);
                joueur1 = false;
            } else {
                //joueur 2
                joueur = "Joueur 2";
                symbole = 'o';
                partieTerminee = JeuMorpion.jouerTour(joueur, plateau, symbole);
                caseVide = JeuMorpion.checkPlateauPlein(plateau);
                JeuMorpion.afficherPlateau(plateau);
                joueur1 = true;
            }
        }
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

    /**
     * Nettoyage/initialisation du plateau
     *
     * @return char[][]
     */
    public static char[][] clearPlateau() {
        char[][] plateau = new char[3][3];
        for (int i = 0; i < plateau.length; i++) {//i : row
            for (int j = 0; j < plateau.length; j++) {//j : column
                plateau[i][j] = '_';
            }
        }
        return plateau;
    }

    /**
     * Déroulement du tour.
     *
     * @param nomJoueur
     * @param plateau
     * @param symbole
     * @return boolean
     * @throws IOException
     */
    public static boolean jouerTour(String nomJoueur, char[][] plateau, char symbole) throws IOException {
        String joueur = nomJoueur;
        boolean partieTerminee = false;
        boolean tourJoue = false;//le joueur commence son tour
        //entrée des coords
        while (tourJoue == false) {
            int x = Integer.valueOf(ConsoleUtil.lireTexte(joueur + " - Coordonnée X :"));
            int y = Integer.valueOf(ConsoleUtil.lireTexte(joueur + " - Coordonnée Y :"));
            //TODO : check si les coords sont hors plateau
            boolean caseLibre = JeuMorpion.checkCaseLibre(plateau, x, y);
            if (caseLibre == true) {
                //la case est libre
                plateau[x][y] = symbole;
                partieTerminee = JeuMorpion.checkVictoireJoueur(nomJoueur, plateau);
                tourJoue = true;//le joueur a fini son tour
            } else {
                //la case est occupée
                System.out.println("Cette case est occupée.");
            }
        }
        return partieTerminee;
    }

    /**
     * Vérification de la présence d'au moins une case vide
     *
     * @param plateau
     * @return boolean
     */
    public static boolean checkPlateauPlein(char[][] plateau) {
        boolean caseVide = false;
        int caseVideCount = 0;
        for (int i = 0; i < plateau.length; i++) {//i : row
            for (int j = 0; j < plateau.length; j++) {//j : column
                if (plateau[i][j] == '_') {
                    caseVideCount++;
                }
            }
        }
        if (caseVideCount > 0) {
            caseVide = true;
        }
        if (caseVide == false){
            System.out.println("Partie terminée.");
        }
        return caseVide;
    }

    /**
     * Vérifie si la case demandée par le joueur est libre
     *
     * @param plateau
     * @param i
     * @param j
     * @return boolean
     */
    public static boolean checkCaseLibre(char[][] plateau, int i, int j) {
        boolean resultat = false;
        if (plateau[i][j] == '_') {
            resultat = true;
        }
        return resultat;
    }

    /**
     * Vérifier toutes les combinaisons du morpion pour y trouver une victoire
     *
     * @param nomJoueur
     * @param plateau
     * @return boolean
     */
    public static boolean checkVictoireJoueur(String nomJoueur, char[][] plateau) {
        boolean victoire = false;
        //ligne 0
        if (plateau[0][0] == plateau[0][1] && plateau[0][0] == plateau[0][2]) {
            if (plateau[0][0] != '_') {
                victoire = true;
            }
        }
        //ligne 1
        if (plateau[1][0] == plateau[1][1] && plateau[1][0] == plateau[1][2]) {
            if (plateau[1][0] != '_') {
                victoire = true;
            }
        }
        //ligne 2
        if (plateau[2][0] == plateau[2][1] && plateau[2][0] == plateau[2][2]) {
            if (plateau[2][0] != '_') {
                victoire = true;
            }
        }
        //colonne 0
        if (plateau[0][0] == plateau[1][0] && plateau[0][0] == plateau[2][0]) {
            if (plateau[0][0] != '_') {
                victoire = true;
            }
        }
        //colonne 1
        if (plateau[0][1] == plateau[1][1] && plateau[0][1] == plateau[2][1]) {
            if (plateau[0][1] != '_') {
                victoire = true;
            }
        }
        //colonne 2
        if (plateau[0][2] == plateau[1][2] && plateau[0][2] == plateau[2][2]) {
            if (plateau[0][2] != '_') {
                victoire = true;
            }
        }
        //diagonale 1
        if (plateau[0][0] == plateau[1][1] && plateau[0][0] == plateau[2][2]) {
            if (plateau[0][0] != '_') {
                victoire = true;
            }
        }
        //diagonale 2
        if (plateau[2][0] == plateau[1][1] && plateau[2][0] == plateau[0][2]) {
            if (plateau[2][0] != '_') {
                victoire = true;
            }
        }
        if (victoire == true) {
            System.out.println(nomJoueur + " gagne la partie !");
        }
        return victoire;
    }
}
