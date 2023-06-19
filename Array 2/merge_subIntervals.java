class Solution {
    public int[][] merge(int[][] intervals) {
        // int n = arr.length; // size of the array
        // //sort the given intervals:
        // Arrays.sort(arr, new Comparator<int[]>() {
        //     public int compare(int[] a, int[] b) {
        //         return a[0] - b[0];
        //     }
        // });
        

        // List<List<Integer>> ans = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        //     // if the current interval does not
        //     // lie in the last interval:
        //     if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
        //         ans.add(Arrays.asList(arr[i][0], arr[i][1]));
        //     }
        //     // if the current interval
        //     // lies in the last interval:
        //     else {
        //         ans.get(ans.size() - 1).set(1,
        //                                     Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
        //     }
        // }
        // for(int i=0; i<ans.size(); i++){
        //     arr[i][0] = ans.get(i).get(0);
        //     arr[i][1] = ans.get(i).get(1);
        // }
        // return arr;
        List<int[]> answer = new ArrayList<>();
        
        if(intervals.length != 0 || intervals != null){
            Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
            
            int start = intervals[0][0];
            int end = intervals[0][1];
            for(int[] i: intervals){
                if(i[0] <= end){
                    end = Math.max(end, i[1]);
                } else {
                    answer.add(new int[]{start,end});
                    start = i[0];
                    end = i[1];
                }
            }
            answer.add(new int[]{start,end}); 
            
        }
        
        return answer.toArray(new int[0][]); 
    }
}