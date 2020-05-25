package net.openu.structure.hashtable;

import java.util.LinkedList;

/**
 * Created by iopenu@gmail.com on 2020/05/25
 * Github : https://github.com/bnbaek
 */
public class HashTable {
  LinkedList<Node>[] data;

  public HashTable(int size) {
    data = new LinkedList[size];
  }


  public void put(String key, String value) {
    int hashCode = getHashCode(key);
    int index = getIndex(hashCode);

    LinkedList<Node> nodes = data[index];
    if (nodes == null) {
      nodes = new LinkedList<>();
      data[index] = nodes;
    }

    Node node = searchKey(nodes, key);

    if (node == null) {
      nodes.addLast(new Node(key, value));
      return;
    }
    node.setValue(value);

  }

  public String get(String key) {

    int hashCode = getHashCode(key);
    int index = getIndex(hashCode);

    LinkedList<Node> nodes = data[index];

    Node node = searchKey(nodes, key);
    if (node != null) {
      return node.getValue();
    }

    return null;
  }


  //hashTable Index
  private int getIndex(int hashCode) {
    return hashCode % data.length;
  }

  //GET HASHCODE
  private int getHashCode(String key) {
    int hashCode = 0;
    for (char c : key.toCharArray()) {
      hashCode += c;
    }
    return hashCode;
  }

  Node searchKey(LinkedList<Node> list, String key) {
    if (list == null) return null;
    for (Node node : list) {
      if (node.getKey().equals(key)) {
        return node;
      }
    }

    return null;
  }


}
