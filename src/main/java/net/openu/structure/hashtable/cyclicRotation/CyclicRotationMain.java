package net.openu.structure.hashtable.cyclicRotation;

/**
 * Created by iopenu@gmail.com on 2020/06/04
 * Github : https://github.com/bnbaek
 */
public class CyclicRotationMain {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] input = {1,2,3,4};
    int[] solution1 = solution.solution(input, 6);

    if (solution1==null) return;
    for(int a : solution1){
      System.out.print(a + " ");
    }
  }
}
