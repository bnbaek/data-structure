package net.openu.structure.hashtable;

/**
 * Created by iopenu@gmail.com on 2020/05/25
 * Github : https://github.com/bnbaek
 */
public class HashTableMain {
  public static void main(String[] args) {
    HashTable hashTable = new HashTable(3);
    hashTable.put("hi","hivalue");
    hashTable.put("hello","helloValue");
    hashTable.put("pen","penValue");
    hashTable.put("pen","pencil");
    System.out.println("pen > "+ hashTable.get("pen"));
    System.out.println("pen > "+ hashTable.get("hello"));


  }
}
