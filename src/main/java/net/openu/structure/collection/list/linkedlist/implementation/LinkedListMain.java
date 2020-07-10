package net.openu.structure.collection.list.linkedlist.implementation;

import java.util.Arrays;

/**
 * Created by iopenu@gmail.com on 2020/07/09
 * Github : https://github.com/bnbaek
 */
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast( 20);
        numbers.addLast(30);
        numbers.addLast(40);

        numbers.add(100,70);
        System.out.println("numbers.node = " + numbers.node(2));

        System.out.println("toString = "+numbers);
        System.out.println(numbers.removeFirst());
        System.out.println("toString = "+numbers);

        System.out.println("=======");

        System.out.println(numbers.removeLast());
        System.out.println("toString = "+numbers);

        LinkedList.ListIterator listIterator = numbers.listIterator();

//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//        listIterator.add(5);
//        System.out.println("toString = "+numbers);
//        listIterator.next();
//        listIterator.add(15);
//        System.out.println("toString = "+numbers);

        System.out.println("toString = "+numbers);
        while(listIterator.hasNext()){
            if((int)listIterator.next() == 30)
                listIterator.remove();
        }
        System.out.println("toString = "+numbers);
    }
}
