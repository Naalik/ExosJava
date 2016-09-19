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
public class Serpent extends Reptile {
    
    private String nom;

    public Serpent(String nom) {
        this.nom = nom;
    }
    

    @Override
    public void manger() {
        System.out.println(this.nom + " gloups.");
    }

    @Override
    public void bouger() {
        System.out.println(this.nom + " rolls.");
    }

    @Override
    public void sleep() {
        System.out.println(this.nom + " ronfle.");
    }
    
}
