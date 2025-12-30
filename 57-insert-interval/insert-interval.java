// class Solution {
//     public int[][] insert(int[][] intervals, int[] newInterval) {
//         if (intervals == null || intervals.length == 0) {
//             return new int[0][];
//         }
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         List<int[]> res = new ArrayList<>();
//         res.add(intervals[0]);
//         for (int i = 1; i < intervals.length; i++) {
//             int[] curr = intervals[i];
//             int[] prev = res.get(res.size() - 1);

//             if (curr[0] <= prev[1]) {
//                 prev[1] = Math.max(prev[1], curr[1]);
//             } else {
//                 res.add(curr);
//             }
//         }
//         return res.toArray(new int[res.size()][]);
//     }
// }


class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        
        for (int[] interval : intervals) {
            list.add(interval);
        }
        list.add(newInterval);
        
        list.sort((a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> res = new ArrayList<>();
        res.add(list.get(0));
        
        for (int i = 1; i < list.size(); i++) {
            int[] curr = list.get(i);
            int[] prev = res.get(res.size() - 1);
            
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                res.add(curr);
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }
}
