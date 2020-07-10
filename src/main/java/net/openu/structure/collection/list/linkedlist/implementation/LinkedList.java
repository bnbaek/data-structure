package net.openu.structure.collection.list.linkedlist.implementation;


/**
 * Created by iopenu@gmail.com on 2020/07/09
 * Github : https://github.com/bnbaek
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;


    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + String.valueOf(data) +
                    '}';
        }


    }

    public void addFirst(Object data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object data) {
        Node node = new Node(data);
        if (size == 0) {
            addFirst(data);
            return;
        }
        tail.next = node;
        tail = node;
        size++;

    }

    public Object removeFirst() {
        Node temp = head;
        head = temp.next;
        size--;
        return temp.data;
    }

    public Object remove(int index) {

        if (index == 0) return removeFirst();
        if (size < index) {
            return null;
        }

        Node node = node(index - 1);
        Node removeTargetNode = node.next;
        Node connectNode = removeTargetNode.next;
        node.next = connectNode;
        size--;
        return removeTargetNode.data;
    }

    public Object removeLast() {
        return remove(size - 1);

    }

    public void add(int index, Object data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (size < index) {
            addLast(data);
            return;
        }

        Node beforeNode = node(index - 1);
        Node nextNode = beforeNode.next;
        Node node = new Node(data);

        beforeNode.next = node;
        node.next = nextNode;
        size++;

    }

    public Node node(int index) {
        Node x = head;

        for (int i = 0; i < index; i++) {
            x = x.next;
        }

        return x;

    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return node(index).data;
    }

    public int indexOf(Object data) {
        Node temp = head;

        int index = 0;

        while (temp.data != data) {
            temp = temp.next;
            index++;
            if (temp == null) {
                return -1;
            }
        }

        return index;
    }


    @Override
    public String toString() {
        if (head == null) return "[]";

        Node temp = head;
        String str = "[";
        while (temp.next != null) {
            str += (temp.data + " ,");
            temp = temp.next;

        }
        str += temp.data;
        return str + "]";
    }


    public ListIterator listIterator() {
        return new ListIterator();
    }


    public class ListIterator {
        private Node next;
        private Node lastReturned;
        private int nextIndex;

        public ListIterator() {
            next = head;
            nextIndex = 0;
        }

        public Object next() {
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }

        public void add(Object data) {
            Node node = new Node(data);

            if (lastReturned == null) {
                head = node;
            } else {
                lastReturned.next = node;
            }
            node.next = next;

            lastReturned = node;
            nextIndex++;
            size++;

        }

        public void remove() {
            if (nextIndex == 0) {
                throw new IllegalStateException();
            }
            LinkedList.this.remove(nextIndex - 1);
            nextIndex--;
        }


        public int getNextIndex() {
            return nextIndex;
        }

        public boolean hasNext() {
            return size > nextIndex;
        }
    }
}
