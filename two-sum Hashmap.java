//if len =2 then ans always [0,1]
Arrays.sort(nums);
int i = 0;
int j = nums.length-1;
int[] ans = new int[2];
int val = 0;
while(i<j){
    val = nums[i]+nums[j];
    if(val == target){
        ans[0] = i;
        ans[1] = j;
        return ans;
    }
    if(val < target){
        i++;
    }
    if(val > target){
        j--;
    }
}