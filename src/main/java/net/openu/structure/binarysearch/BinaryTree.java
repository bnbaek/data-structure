package net.openu.structure.binarysearch;

/**
 * Created by iopenu@gmail.com on 2020/07/15
 * Github : https://github.com/bnbaek
 */
public class BinaryTree {
    public int search(int[] arrays, int searchTarget) {

        int lowest = 0;
        int highest = arrays.length - 1;
        int middle;

        while (lowest <= highest) {

            middle = (lowest + highest) / 2;
            System.out.println("middle before = " + middle);
            if (arrays[middle] == searchTarget) {
                return middle;
            } else if (arrays[middle] > searchTarget) {
                highest = middle - 1;
            } else if (arrays[middle] < searchTarget) {
                lowest = middle + 1;
            }
            System.out.println("result  = "+lowest+" "+ middle+" "+highest);
        }

        return -1;
    }
}
