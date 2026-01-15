import java.util.*;
import java.util.*;

class Solution {
    public int[][] optimal(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        // Sort by starting time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];
        result.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] <= current[1]) {
                // Overlap → merge
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap → new interval
                current = next;
                result.add(current);
            }
        }

        // Convert List<int[]> to int[][]
        return result.toArray(new int[result.size()][]);
    }
}

public class mergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,4},{4,10},{10,12}};

        Solution sol = new Solution();
        int[][] result = sol.optimal(intervals);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
