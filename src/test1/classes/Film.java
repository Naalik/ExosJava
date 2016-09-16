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
public class Film {
    private String titre;
    private Integer duree;//en minutes
    private String synopsis;
    private Integer annee;

    public Film(String titre, Integer duree, String synopsis, Integer annee) {
        this.titre = titre;
        this.duree = duree;
        this.synopsis = synopsis;
        this.annee = annee;
    }

    @Override //surcharge de la méthode .toString de la classe Object
    public String toString() {
        return titre + " " + duree + "mn \"" + synopsis + "\" " + annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }
    
    
    
}
