// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
//solution using graph needs to be done
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        //vvimp java8
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> yolo = new LinkedList<>();
        //why not LinkedList<int[]>()
        
        for(int i=0;i<n; i++){
            if(yolo.isEmpty()||yolo.getLast()[1] < intervals[i][0]){
                yolo.add(intervals[i]);
            }
            else{
                yolo.getLast()[1] = Math.max(yolo.getLast()[1],intervals[i][1]);
            }
        }
        //size of new 2d int array imp
        int[][] arr = new int[yolo.size()][];
        arr = yolo.toArray(arr);
        return arr;
    }
}