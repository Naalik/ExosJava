/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.IOException;

/**
 *
 * @author admin
 */
public class MathUtil {

    public static Integer carre(int entier) throws IOException {
        int resultat = entier * entier;
        return resultat;
    }

    /**
     * Nombre aléatoire entre 1 et 100
     *
     * @return int
     */
    public static Integer aleatoire() {
        double nombreSecretD = Math.random();
        int alea = (int) (nombreSecretD * 100) + 1;
        return alea;
    }

    /**
     * Nombre aléatoire entre min et max, reorder de min et max
     *
     * @param min
     * @param max
     * @return int
     */
    public static Integer aleatoire(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        int amplitude = max - min;
        if (amplitude == 0) {
            amplitude = 1;
        } else {
            amplitude += 1;
        }
        double nombreSecretD = Math.random();
        int alea = (int) (nombreSecretD * amplitude) + min;// (int) pour prendre proprement l'entier du double généré
        return alea;
    }

    /**
     * Nombre aléatoire entre min et max, reorder de min et max, version à
     * boucle
     *
     * @param min
     * @param max
     * @return int
     */
    public static Integer aleatoireWhile(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        double nombreSecretD;
        int alea = 0;
        do {
            nombreSecretD = Math.random();
            alea = (int) (nombreSecretD * max) + 1;
        } while (alea > max || alea < min);
        return alea;
    }

    public static Integer exposant(int nombre, int puissance) {
        int resultat;
        if (puissance <= 0) {
            resultat = -1;
        } else {

            resultat = nombre;
            do {
                puissance--;
                resultat = resultat * nombre;
            } while (1 < puissance);
        }
        return resultat;
    }

    public static Long factorielle(int nombre) {
        if (nombre < 0) {
            throw new RuntimeException("Erreur mathématique.");
        } else {
            long resultat = nombre;
            do {
                nombre--;
                resultat = resultat * nombre;
            } while (nombre > 1);
            return resultat;
        }
    }

    public static Long factorielleRecursive(int niveauActuel, long resultatPrecedent) {
        if (resultatPrecedent < 0) {
            throw new RuntimeException("Erreur mathématique.");
        } else {
            long resultat = resultatPrecedent;
            if (niveauActuel > 1) {
                niveauActuel--;
                resultat = resultat * niveauActuel;
                return MathUtil.factorielleRecursive(niveauActuel, resultat);
            } else {
                return resultat;
            }
        }
    }

    /**
     *
     * @author admin
     */
    public static class FonctionCarre {

        public static void main(String[] args) throws IOException {
            String txt = ConsoleUtil.lireTexte("Veuillez entrer un nombre entier :");
            Integer entier = Integer.valueOf(txt);
            Integer resultat = MathUtil.carre(entier);
            System.out.println("Le carré de " + entier + " est : " + resultat);
        }
    }

}
