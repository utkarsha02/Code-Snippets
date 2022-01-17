// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// the following is my solution to problem however, a simpler solution is also possible
// Check out sorting and Boyer-Moore Voting Algorithm method
import java.util.*;
import java.util.Set;
class Solution {
    public int majorityElement(int[] nums) {
        Hashtable<Integer,Integer> map = new Hashtable<Integer, Integer>();
        int n = nums.length;
        int max = 0;
        for(int i=0; i<n; i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }
            else{
                int ans = map.get(nums[i]).intValue();
                ans++;
                map.put(nums[i],ans);
            }
        }
        
        int boundary = n/2;
        for(int i=0; i<n; i++){
            if(map.get(nums[i]) > boundary){
                // max = map.get(nums[i]);
                max = nums[i];
            }
        }
        
        return max;
    }
}
