/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4;


/**
 *
 * @author Stas
 */
public interface MyLinkedListI<E> {
    
    // extends Iterable<E>
    //добавить элемент в конец +
    void add(E e);
    //добавить элемент по индексу +
    void add(int index,E e);
    //обнуление коллекции +    
    void clear();
    //енруть елемент по индексу +
    E get(int i);
    //вернуть первое появление обьекта в коллекции +
    int indexOf(E e);
    //удалить елемент по индексу +
    E remove(int index);
    //заменит элемент ibdexx элеменом е +
    E set(int index,E e);
    //вернет разме +
    int size();
    
    Object[] toArray();
    //преобразует в строку +
    @Override
    String toString();
}
