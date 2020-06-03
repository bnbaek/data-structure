package net.openu.structure.hashtable.cyclicRotation;

/**
 * Created by iopenu@gmail.com on 2020/06/04
 * Github : https://github.com/bnbaek
 */
class Solution {
  public int[] solution(int[] A, int K) {
    if(A==null) return null;
    int arrLength = A.length;
    K = K % arrLength;

    if (K == 0) return A;

    int[] resultArr = new int[arrLength];
    int cursor = 0;
    for (int i = 0; i < arrLength; i++) {
      if ((K + i + 1) > arrLength) {
        resultArr[cursor] = A[i];
        cursor++;
      } else {
        resultArr[i + K] = A[i];
      }
    }


    return resultArr;
  }
}