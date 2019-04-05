/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 *
 * @author Stas
 */
public class MyLinkedList<E> implements MyLinkedListI<E>{
    
    private   Entry<E> header = new Entry<E>(null, null, null);
    private   int size = 0;
    public int nextIndex;
    
    public E element;
    
    public MyLinkedList() {
        header.next = header.previous = header;
    }
    /*
        добавить в конец
    */
    @Override
    public void add(E e) {
        addBefore(e, header);
    }
    /*
        длбавить по индексу
        addBefore(e, (index==size ? header : entry(index)));
        слишком сложная строчка
    */
    @Override
    public void add(int index, E e) {
        if(index == size){
           addBefore(e, header ); 
        }else{
            addBefore(e,entry(index));
        }
    }
    /*
        создает пустой обьект и сравнивает с ним
        если они не равны то обнуляет елемент, предыдущий и соледующий и переходит с следующему 
        от себя
        убрал обнуление предыдущего обькта, так как по идеее он обнулялся дважды   
        //e.next = e.previous = null;
    */
    @Override
    public void clear() {
        Entry<E> e = header.next;
        while (e != header) {
            Entry<E> next = e.next;            
            e.next = null;
            e.element = null;
            e = next;
        }
        header.next = header.previous = header;
        size = 0;
    }
    /*
        вернет обьект по индексу
    */
    @Override
    public E get(int i) {
        return entry(i).element;
    }
    /*
        проверяет по equals 
        возвращает только первое появление обьекта в коллекции
    */
    @Override
    public int indexOf(Object obj) {
        int index = 0;
        if (obj==null) {
            for (Entry e = header.next; e != header; e = e.next) {
                if (e.element==null)
                    return index;
                index++;
            }
        } else {
            for (Entry e = header.next; e != header; e = e.next) {
                if (obj.equals(e.element))
                    return index;
                index++;
            }
        }
        return -1;
    }
    /*
        удали обьект по индексу
    */
    @Override
    public E remove(int index) {
        return remove(entry(index));
    }
    /*
        установит элемент по индексу старый удалит
    */
    @Override
    public E set(int index, E element) {
        Entry<E> e = entry(index);
        E oldVal = e.element;
        e.element = element;
        return oldVal;
    }

    @Override
    public int size() {
        return size;
    }
    /*
        создает масив обьектов и заполняет его
    */
    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Entry<E> e = header.next; e != header; e = e.next)
            result[i++] = e.element;
	return result;
    }
    /*
        проходит по каждому элементу и записывает его в строку
    */
    @Override
    public String toString() {
        String str = "[";
        Entry<E> e = header;
            for (int i = 0; i < size-1; i++){
                e = e.next;              
                str+=e.element+", ";  
            }
            e = e.next;  
            str+=e.element;
            str+="]";
            return str;
    }  
    /*
        да если есть элемент cлево
    */ 
    public boolean hasPrevious(){	

        return nextIndex!=0;    
    }
    /*
        да если есть элемент справо 
    */ 
    public boolean hasNext(){	

        return nextIndex!=size-1;    
    }
    /*
        перебор в увелечение вправо
    */ 
    
    public Entry<E> next(){  
        if (nextIndex < size-1&&nextIndex>=0){		
            Entry eNext = header;
            eNext.element =header.next;
            nextIndex++;
            return eNext;
        }
        return null;//можно написать чтобы он возвращал ошибку, но я намерено оставил так, потому что мне так нравится
    }
    /*
        перебор в уменьшение влево
    */    
    public Entry<E> previous(){  
        if (nextIndex < size-1&&nextIndex>=0){		
            Entry ePrevious = header;
            ePrevious.element =header.previous;
            nextIndex--;
            return ePrevious;
        }
        return null;//можно написать чтобы он возвращал ошибку, но я намерено оставил так, потому что мне так нравится
    }
    /*
        позволяет узнать номер обьекта при переборе
    */

    public int getNextIndex() {
        return nextIndex;
    }    
    /*
        позволяет задать номер с которого начнеться перебор обьектов
    */

    public void setNextIndex(int nextIndex) {
        this.nextIndex = nextIndex;
    }
    
    
    
    
    
    
    
    
    
    /*
        по сути это итератор
        каждый элемент хранит ссылку на следующий и предыдущий    
    */
    private static class Entry<E> {
	public E element;//этот
	public Entry<E> next;//слудующий
	public Entry<E> previous;//предыдыущий 
        
        
	Entry(E element, Entry<E> next, Entry<E> previous) {
	    this.element = element;
	    this.next = next;
	    this.previous = previous;
	}
        @Override
        public String toString(){
            String str=element.toString();
            return str;
        }
    }

    private Entry<E> addBefore(E e, Entry<E> entry) {
	Entry<E> newEntry = new Entry<E>(e, entry, entry.previous);
	newEntry.previous.next = newEntry;
	newEntry.next.previous = newEntry;
	size++;

	return newEntry;
    }

    private E remove(Entry<E> e) {
	if (e == header)
	    throw new NoSuchElementException();

        E result = e.element;
	e.previous.next = e.next;
	e.next.previous = e.previous;
        e.next = e.previous = null;
        e.element = null;
	size--;
	//modCount++;
        return result;
    }
    /*
        возвращяет элемент по индексу
        проверяет на вхлжения index в интервал от 0 до ласт значения
        входит в фор и поочередно перебирает все значения 
        после выхода приравнивает нужное значение
        добавил отсебятины 
        если index меньше половину то перебор идет от 1 до индекса
        если indedx больше половины то пребор идет от последнего к индексу по убыванию
    */
    private Entry<E> entry(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Не ходи туда, там тебя ждут неприятности"+index+","+size);
        
        Entry<E> e = header;
        if (index < size/2) {
            for (int i = 0; i <= index; i++)
                e = e.next;
        }else{
            for (int i = size; i > index; i--)
                e = e.previous;
        }
        return e;
    } 
    
 
    
    
}
