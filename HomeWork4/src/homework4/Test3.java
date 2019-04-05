/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Stas
 */
public class Test3 {

    public Test3() {
        ArrayList<TestObject> array = new ArrayList<>();
        LinkedList<TestObject> linked = new LinkedList<>();
        
        long oldList;
        long oldMyList;
        
        System.out.println("Test3");
        oldList = System.nanoTime();
        for(int i = 0;i<100000;i++){
            array.add(new TestObject("Stas",i,i*2));
        }
        System.out.println("test add array");
        //System.out.println(list);
        System.out.println(System.nanoTime()-oldList);
        System.out.println("\n");
        
        
        oldMyList = System.nanoTime();
        for(int i = 0;i<100000;i++){
            linked.add(new TestObject("Stas",i,i*2));
        }
        System.out.println("test add linked");
        //System.out.println(myList);
        System.out.println(System.nanoTime()-oldMyList);
        System.out.println("\n");
        
        
        
        oldList = System.nanoTime();
        System.out.println("test get array");
        System.out.println("    "+array.get(1000));
        System.out.println("time = "+(System.nanoTime()-oldList));
        System.out.println("    "+array.get(99000));
        System.out.println("time = "+(System.nanoTime()-oldList));
        System.out.println("\n");
        
        oldMyList = System.nanoTime();
        System.out.println("test get linked");
        System.out.println("    "+linked.get(1000));
        System.out.println("time = "+ (System.nanoTime()-oldMyList));
        System.out.println("    "+linked.get(99000));        
        System.out.println("time = "+ (System.nanoTime()-oldMyList));
        System.out.println("\n");
        
        oldList = System.nanoTime();
        System.out.println("test size array");
        System.out.println(array.size());
        System.out.println("time = "+(System.nanoTime()-oldList));
        System.out.println("\n");
        
        oldMyList = System.nanoTime();
        System.out.println("test size linked");
        System.out.println(linked.size());       
        System.out.println("time = "+ (System.nanoTime()-oldMyList));
        System.out.println("\n");
    }
    
    
}
