//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//solution using 3sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int j=n-1;
        int k=0;
        int sum=0;
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        if(n<3){
            // List<Integer> triplets_inner = new ArrayList<Integer>();
            // triplets.add(triplets_inner);
            return triplets;
        }
//         skip same elemets to remove duplicates
        for(int i=0;i<n-2;i++){
          if(i==0 || nums[i]>nums[i-1]){ 
            int target = -nums[i];
            // System.out.println("target" + target);
            k = i+1;
            j = n-1;
            while(k<j){
                if(k>i+1 && nums[k]==nums[k-1]){
                    k++;
                    continue;
                }
                if(j<n-1 && nums[j]==nums[j+1]){
                    j--;
                    continue;
                }
                sum = nums[k]+nums[j];
                // System.out.println(sum);
                if(sum==target){
                    List<Integer> triplets_inner = new ArrayList<Integer>();
                    triplets_inner.add(nums[i]);
                    triplets_inner.add(nums[k]);
                    triplets_inner.add(nums[j]);
                    triplets.add(triplets_inner);
                }
                if(sum<target){
                    k++;
                }
                else{
                    j--;
                }
            }
          }
        }
        return triplets;
    }
}
