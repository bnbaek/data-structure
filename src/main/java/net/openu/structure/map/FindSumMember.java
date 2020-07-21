package net.openu.structure.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iopenu@gmail.com on 2020/07/21
 * Github : https://github.com/bnbaek
 */
public class FindSumMember {


    public int[] solution(int[] input, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int complement = target - input[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(input[i], i);
        }
        return new int[]{-1, -1};    // No Solution
    }
}
