/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Stas
 */
public class Test1 {

    public Test1() {
        List<String> list = new LinkedList<>();
        MyLinkedList<String> myList = new MyLinkedList<>();
        System.out.println("Test1");
        list.add("10");
        list.add("20");
        list.add("30");
        
        myList.add("10");
        myList.add("20");
        myList.add("30");
        
        System.out.println("list: "+list);
        //System.out.println("\n");
        System.out.println("Mylist: "+myList);
        
        list.add(1,"101");
        myList.add(1,"101");
        System.out.println("\n");
        System.out.println("Добавление по индексу");
        System.out.println("list: "+list);
        //System.out.println("\n");
        System.out.println("Mylist: "+myList);
        
        list.set(1,"22");
        myList.set(1,"22");
        System.out.println("\n");
        System.out.println("замена по индексу");
        System.out.println("list: "+list);
        //System.out.println("\n");
        System.out.println("Mylist: "+myList);
        
        System.out.println("\n");
        System.out.println("Вывод по индексу 3");
        System.out.println("list: "+list.get(3));
        //System.out.println("\n");
        System.out.println("Mylist: "+myList.get(3));
        
        list.remove(2);
        myList.remove(2);
        System.out.println("\n");
        System.out.println("Удаление по индексу 2");
        System.out.println("list: "+list);
        //System.out.println("\n");
        System.out.println("Mylist: "+myList);
        
        System.out.println("\n");
        System.out.println("Размер");
        System.out.println("list: "+list.size());
        //System.out.println("\n");
        System.out.println("Mylist: "+myList.size());
        
        System.out.println("\n");
        System.out.println("toArray");
        System.out.println("list: "+Arrays.toString(list.toArray()));
        //System.out.println("\n");
        System.out.println("Mylist: "+Arrays.toString(myList.toArray()));
        
        System.out.println("\n");
        System.out.println("toString");
        System.out.println("list: "+list.toString());
        //System.out.println("\n");
        System.out.println("Mylist: "+myList.toString());
        
    }
    
    
}
