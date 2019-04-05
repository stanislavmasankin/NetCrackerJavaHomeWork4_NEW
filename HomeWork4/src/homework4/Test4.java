/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;



/**
 *
 * @author Stas
 */
public class Test4 {

    public Test4() {
        long oldhashSet;
        long oldlinkedHashSet;
        long oldtreeSet;
        
        HashSet<Integer> hashSet = new HashSet<>();        
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        System.out.println("Test4");
        oldhashSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            hashSet.add(i);
        }
        System.out.println("test add HashSet");
        System.out.println(System.nanoTime()-oldhashSet);
        System.out.println("\n");
        
        
        oldlinkedHashSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            linkedHashSet.add(i);
        }
        System.out.println("test add linkedHashSet");
        System.out.println(System.nanoTime()-oldlinkedHashSet);
        System.out.println("\n");
        
        
        oldtreeSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            treeSet.add(i);;
        }
        System.out.println("test add treeSet");
        System.out.println(System.nanoTime()-oldtreeSet);
        System.out.println("\n");

        
        
        
        
        ///////////////////////////////////////////////
        oldhashSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            hashSet.add(10000-i);
        }
        System.out.println("test add HashSet В порядке убывания ");
        System.out.println(System.nanoTime()-oldhashSet);
        System.out.println("\n");
        
        
        oldlinkedHashSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            linkedHashSet.add(10000-i);
        }
        System.out.println("test add linkedHashSet В порядке убывания ");
        System.out.println(System.nanoTime()-oldlinkedHashSet);
        System.out.println("\n");
        
        
        oldtreeSet = System.nanoTime();
        for(int i = 0;i<10000;i++){
            treeSet.add(10000-i);
        }
        System.out.println("test add treeSet В порядке убывания ");
        System.out.println(System.nanoTime()-oldtreeSet);
        System.out.println("\n");

    

    }
    
    
}
