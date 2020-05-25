package net.openu.structure.hashtable;

/**
 * Created by iopenu@gmail.com on 2020/05/25
 * Github : https://github.com/bnbaek
 */
public class Node {
  private String key;
  private String value;

  public Node(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
