/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author admin
 */
public class Variable {

    public static void main(String[] args) {
        // Types primitifs
        byte byte1 = 0;//de -128 à 127
        Byte b1 = new Byte("12");// tout type a une classe qui lui correspond
        short short1;// >10000
        int entier1, entier2, somme;
        //long long1 = 1234567890;
        Long l = new Long(1234567890);//l est conditionnée par les prop de Long
        // Types primitifs décimaux
        float float1 = (float) 1234.56;
        double double1 = 1234.56;
        // Type boléen
        boolean boolean1;// true ou false
        // Type string
        String string1 = "Poule raptor.";
        byte1 = 127;
        entier1 = 123;
        entier2 = 456;
        somme = entier1 + entier2;
        System.out.println(somme);
        System.out.println(string1);
        System.out.println(l);
        System.out.println(l.toString());

        Integer intPoule = new Integer(123);
        String stringPoule = new String(intPoule.toString());
        Long longPoule = Long.valueOf(stringPoule);
        longPoule += 100;
        String stringPoule2 = new String(longPoule.toString());
        System.out.println(stringPoule2);
    }
}
