/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Stas
 */
public class Test5 {
    public Test5() {
        long oldhashSet;
        long oldlinkedHashSet;
        long oldtreeSet;
        
        HashMap hashSet = new HashMap();        
        LinkedHashMap linkedHashSet = new LinkedHashMap();
        TreeMap treeSet = new TreeMap();
        
        System.out.println("Test4");
        oldhashSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            hashSet.put(new TestObject("Stas",i,i/3.14),i);
        }
        System.out.println("test add HashMap");
        System.out.println(System.nanoTime()-oldhashSet);
        System.out.println("\n");
        
        
        oldlinkedHashSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            linkedHashSet.put(new TestObject("Stas",i,i/3.14),i);
        }
        System.out.println("test add linkedHashMap");
        System.out.println(System.nanoTime()-oldlinkedHashSet);
        System.out.println("\n");
        
        
        oldtreeSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            treeSet.put(new TestObject("Stas",i,i/3.14),i);
        }
        System.out.println("test add treeMap");
        System.out.println(System.nanoTime()-oldtreeSet);
        System.out.println("\n");

        
        
        
        
        ///////////////////////////////////////////////
        oldhashSet = System.nanoTime();
        for(int i = 0;i<1000;i++){
            hashSet.put(new TestObject("Stas",10000-i,i/3.14),10000-i);
        }
        System.out.println("test add HashMap В порядке убывания ");
        System.out.println(System.nanoTime()-oldhashSet);
        System.out.println("\n");
        
        
        oldlinkedHashSet = System.nanoTime();
        for(int i = 0;i<1000;i++){
            linkedHashSet.put(new TestObject("Stas",10000-i,i/3.14),10000-i);
        }
        System.out.println("test add linkedHashMap В порядке убывания ");
        System.out.println(System.nanoTime()-oldlinkedHashSet);
        System.out.println("\n");
        
        
        oldtreeSet = System.nanoTime();
        for(int i = 0;i<1000;i++){
            treeSet.put(new TestObject("Stas",10000-i,i/3.14),10000-i);
        }
        System.out.println("test add treeMap В порядке убывания ");
        System.out.println(System.nanoTime()-oldtreeSet);
        System.out.println("\n");

    

    }
    
    
}
