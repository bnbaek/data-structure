package net.openu.structure.reverse;

/**
 * Created by iopenu@gmail.com on 2020/06/01
 * Github : https://github.com/bnbaek
 */
public class ReverseStringMain {
  public static void main(String[] args) {
    System.out.println(reverse("hello"));
  }

  private static String reverse(String input){
    if(input ==null){
      return null;
    }
    String output = "";

    for(int i = input.length() -1 ; i >=0 ; i--){
      output += input.charAt(i);
    }
    return output;
  }
}
