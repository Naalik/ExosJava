/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
public class Acteur {
    private String nom;
    private String prenom;
    private static int nbObjets = 0;

    public Acteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        nbObjets++;
    }
    
    
    public static int getNbObjets() {
        return nbObjets;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
}
