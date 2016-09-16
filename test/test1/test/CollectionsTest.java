/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.Collection;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CollectionsTest {

    @Test
    public void map() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation procédural");
        map.put("javascript", "langage de script objet");
        System.out.println(map.size() + " " + map.keySet());
        System.out.println(map.get("java"));
    }

    @Test
    public void reccupC() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation procédural");
        map.put("javascript", "langage de script objet");
        System.out.println(map.size() + " " + map.keySet());
        System.out.println(map.get("c"));
    }

    @Test
    public void remplacerDef() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation procédural");
        map.put("javascript", "langage de script objet");
        map.replace("java", "langage de ouf");
        System.out.println(map.size() + " " + map.keySet());
        System.out.println(map.get("java"));
    }

    @Test
    public void removeJavascript() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation procédural");
        map.put("javascript", "langage de script objet");
        map.remove("javascript");
        System.out.println(map.size() + " " + map.keySet());
        System.out.println(map.get("java"));
    }

    @Test
    public void ajoutMapAMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation procédural");
        map.put("javascript", "langage de script objet");
        //créer nouvelle map avec 2 def
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("php", "langage de programmation web");
        map2.put("cobol", "langage des dinosaures");
        //ajouter les maps
        map.putAll(map2);
        System.out.println(map.size() + " " + map.keySet());
        System.out.println(map);
    }

    @Test
    public void toutesDefs() {
        HashMap<String, String> map = new HashMap<>();
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation procédural");
        map.put("javascript", "langage de script objet");
        //reccup les clés et sortir chaque def pour chaque clé
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
