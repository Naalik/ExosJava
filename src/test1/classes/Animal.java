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
public abstract class Animal implements Sleepable {

    private String nom;

//    public Animal(String nom) {
//        this.nom = nom;
//    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void manger();

    public abstract void bouger();

    public void dormir() {

    }
}
