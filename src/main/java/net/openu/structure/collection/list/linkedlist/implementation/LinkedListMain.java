package net.openu.structure.collection.list.linkedlist.implementation;

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

        numbers.add(100,70);
        System.out.println("numbers.node = " + numbers.node(2));

        System.out.println("toString = "+numbers);
        System.out.println(numbers.removeFirst());
        System.out.println("toString = "+numbers);

        System.out.println("=======");

        System.out.println(numbers.removeLast());
        System.out.println("toString = "+numbers);




    }
}
