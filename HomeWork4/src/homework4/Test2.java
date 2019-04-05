/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Stas
 */
public class Test2 {

    public Test2() {
        long oldList;
        long oldMyList;
        
        LinkedList<TestObject> list = new LinkedList<>();        
        MyLinkedList<TestObject> myList = new MyLinkedList<>();
        
        System.out.println("Test2");
        oldList = System.nanoTime();
        for(int i = 0;i<100000;i++){
            list.add(new TestObject("Stas",i,i*2));
        }
        System.out.println("test add list");
        //System.out.println(list);
        System.out.println(System.nanoTime()-oldList);
        System.out.println("\n");
        
        
        oldMyList = System.nanoTime();
        for(int i = 0;i<100000;i++){
            myList.add(new TestObject("Stas",i,i*2));
        }
        System.out.println("test add myList");
        //System.out.println(myList);
        System.out.println(System.nanoTime()-oldMyList);
        System.out.println("\n");
        ////////////////////////////////////////////////
        
        oldList = System.nanoTime();
        System.out.println("test get list");
        System.out.println("    "+list.get(1000));
        System.out.println("time = "+(System.nanoTime()-oldList));
        System.out.println("    "+list.get(99000));
        System.out.println("time = "+(System.nanoTime()-oldList));
        System.out.println("\n");
        
        oldMyList = System.nanoTime();
        System.out.println("test get myList");
        System.out.println("    "+myList.get(1000));
        System.out.println("time = "+ (System.nanoTime()-oldMyList));
        System.out.println("    "+myList.get(99000));        
        System.out.println("time = "+ (System.nanoTime()-oldMyList));
        System.out.println("\n");
        
        oldList = System.nanoTime();
        System.out.println("test size list");
        System.out.println(list.size());
        System.out.println("time = "+(System.nanoTime()-oldList));
        System.out.println("\n");
        
        oldMyList = System.nanoTime();
        System.out.println("test size myList");
        System.out.println(myList.size());       
        System.out.println("time = "+ (System.nanoTime()-oldMyList));
        System.out.println("\n");
    }
    
}
