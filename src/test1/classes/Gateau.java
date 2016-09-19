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
public class Gateau {

    private String forme;
    private String gout;
    private String couleur;
    private static int nbGateau = 0;

    @Override
    public String toString() {
        return "Forme : " + forme + ", goût : " + gout + ", couleur : " + couleur + ".";
    }

    public Gateau(String forme, String gout, String couleur) {
        this.forme = forme;
        this.gout = gout;
        this.couleur = couleur;
        this.nbGateau++;
    }
    
    public static int getNbGateau() {
        return nbGateau;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String aForme) {
        forme = aForme;
    }

    public String getGout() {
        return gout;
    }

    public void setGout(String gout) {
        this.gout = gout;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
