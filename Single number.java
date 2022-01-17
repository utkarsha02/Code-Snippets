// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Solution 1 : O(n^2), Solution 2: using maps, Solution 3: Using XOR best solution is solution 3
//solution 2
import java.util.*;
import java.util.Set;
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans=0;
        Hashtable<Integer,Boolean> map = new Hashtable<Integer,Boolean>();
        if(n==1){
            return nums[0];
        }
        
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],false);
            }
            else{
                map.replace(nums[i],true);
            }
        }
        
        Set<Integer> setOfKeys = map.keySet();
        for(Integer key : setOfKeys){
            if(map.get(key) == false){
                ans = key.intValue();
                break;
            }
        }
        
        return ans;
    }
}

//Soltuon 3
for(int i=0; i<n; i++){
    ans  = ans^nums[i];
}
return ans;