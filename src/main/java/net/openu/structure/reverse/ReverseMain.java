package net.openu.structure.reverse;

/**
 * Created by iopenu@gmail.com on 2020/06/01
 * Github : https://github.com/bnbaek
 */
public class ReverseMain {

  public static void main(String[] args) {

    System.out.println(reverseBytes("test"));
    System.out.println(reverseStringBuffer("abcd"));
  }

  private static String reverseBytes(String input){
    if (input==null) return null;
    byte[] inputBytes = input.getBytes();
    byte[] returnBytes = new byte[inputBytes.length];

    for (int i=0; i<inputBytes.length ; i++){
      returnBytes[i] = inputBytes[inputBytes.length-i-1];
    }
    return new String(returnBytes);
  }

  private static String reverseStringBuffer(String input){
    if(input==null) return null;

    StringBuffer inputBuffer = new StringBuffer();

    inputBuffer.append(input);

    return inputBuffer.reverse().toString();


  }
}
