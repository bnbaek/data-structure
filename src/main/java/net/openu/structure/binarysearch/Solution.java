package net.openu.structure.binarysearch;

/**
 * Created by iopenu@gmail.com on 2020/07/09
 * Github : https://github.com/bnbaek
 */
public class Solution {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        int search = binaryTree.search(new int[]{1, 2, 3, 4, 5, 6}, 6);
        System.out.println("search = " + search);
    }


}
