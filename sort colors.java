// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.
//try doing 2 pointer also
class Solution {
    public void quicksort(int[] A, int low, int high){
        if(low<high){
            int pivot = Partition(A,low,high);
            quicksort(A,low,pivot-1);
            quicksort(A,pivot+1,high);
        }
    }
    
    public int Partition(int[] A, int low, int high){
        int pivot = A[low];
        int start = low;
        int end = high;
        
        while(start<end){
            while(start<A.length-1 && A[start]<=pivot){
                start++;
            }
            while(A[end]>pivot){
                end--;
            }
            if(start<end){
                swap(A,start,end);
            }
        }
        swap(A,low,end);
        //end gives original position of pivot in final sorted array
        return end;
        
    }
    
    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }
}