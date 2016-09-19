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
public class Tortue extends Reptile {
    
    private String nom;

    public Tortue(String nom) {
        this.nom = nom;
    }
    

    @Override
    public void manger() {
        System.out.println(this.nom + " croque.");
    }

    @Override
    public void bouger() {
        System.out.println(this.nom + " plouf.");
    }
    
}
