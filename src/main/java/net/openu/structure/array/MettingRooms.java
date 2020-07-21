package net.openu.structure.array;

/**
 * Created by iopenu@gmail.com on 2020/07/18
 * Github : https://github.com/bnbaek
 */

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays.sort()
 * time complexity of O(n logn n)
 * space complexity of O(1).
 */

class Interval {
    int start;
    int end;

    Interval() {
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class MettingRooms {

    public static void main(String[] args) {
        MettingRooms mettingRooms = new MettingRooms();


        Interval in1 = new Interval(15, 20);
        Interval in2 = new Interval(5, 10);
        Interval in3 = new Interval(0, 30);

        Interval[] intervals = {in1, in2, in3};

        boolean solve = mettingRooms.solve(intervals);


    }

    public boolean solve(Interval[] intervals) {
        if (intervals == null) return false;
        //1 sorting
        print(intervals);
        Arrays.sort(intervals, Comp);
        System.out.println("===after sort====");
        print(intervals);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start)
                return false;
        }

        return true;


    }

    private void print(Interval[] intervals) {
        for (Interval in : intervals) {
            System.out.println(in.start + " - " + in.end);
        }
    }

    Comparator<Interval> Comp = new Comparator<Interval>() {

        @Override
        public int compare(Interval a, Interval b) {
            return a.start - b.start;
        }
    };

}
