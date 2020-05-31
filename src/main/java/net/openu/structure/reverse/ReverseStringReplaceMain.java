package net.openu.structure.reverse;

/**
 * Created by iopenu@gmail.com on 2020/06/01
 * Github : https://github.com/bnbaek
 */
public class ReverseStringReplaceMain {
  public static void main(String[] args) {

    byte[] inputs = "test".getBytes();
    reverseReplace(inputs,0,inputs.length-1);
    System.out.println(new String(inputs));
  }

  static void reverseReplace(byte[] bytes, int start, int end) {
    byte temp;

    while (start < end) {
      temp = bytes[start];
      bytes[start] = bytes[end];
      bytes[end] = temp;
      start ++;
      end --;
    }

  }
}
