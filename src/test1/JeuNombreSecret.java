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
public class JeuNombreSecret {

    public static void main(String[] args) throws IOException {

        boolean gagne = false;
        
        int compteur = 0;
        
        String minTxt = ConsoleUtil.lireTexte("Donnez-moi un nombre minimu...");
        Integer min = Integer.valueOf(minTxt);
        String maxTxt = ConsoleUtil.lireTexte("... et un maximum.");
        Integer max = Integer.valueOf(maxTxt);
        System.out.println("Merci !");
        int nombreMystere = MathUtil.aleatoire(min, max);
        System.out.println("Maintenant, devinez à quel nombre je pense dans cette amplitude ! :) ");

        do {

            String txt = ConsoleUtil.lireTexte("Essai : ");
            Integer entier = Integer.valueOf(txt);
            compteur++;

            if (nombreMystere == entier) {
                String niveau = "";
                System.out.println("----------");
                System.out.println("Gagné !");
                System.out.println("Réponse : " + nombreMystere);
                System.out.println("Nombre d'essais : " + compteur);
                if (compteur < 3) {
                    niveau = "Excellent ! *fait péter le champagne* ";
                } else if (compteur < 6) {
                    niveau = "Bien joué ! :D ";
                } else if (compteur < 9) {
                    niveau = "Cool ! :) ";
                } else if (compteur < 12) {
                    niveau = "Mouais. :| ";
                } else {
                    niveau = "Bof... :/ ";
                }
                System.out.println("Votre niveau : "+niveau);
                gagne = true;

            } else if (nombreMystere > entier) {

                System.out.println("Trop petit ! ;) ");

            } else {

                System.out.println("Trop grand ! :o ");

            }
        } while (gagne == false);

    }
}
