/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Gateau;

/**
 *
 * @author admin
 */
public class GateauTest {

    @Test
    public void testGateau() {
        Gateau g1 = new Gateau("rond", "chocolat", "brun");
        Gateau g2 = new Gateau("carré", "pomme", "vert");
        Gateau g3 = new Gateau("triangle", "citron", "jaune");

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        
        g1.setForme("pièce montée");
        
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        
        g2.setGout("fraise");
        
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        
        g2.setCouleur("rouge");
        
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        
        System.out.println(Gateau.getNbGateau());
    }

}
