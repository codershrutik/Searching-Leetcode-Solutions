//Leetcode Problem Link - https://leetcode.com/problems/search-insert-position
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int ans = binarySearch(nums, target);
        return ans;
    }

    public int binarySearch(int[] arr, int key){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            
            int mid = start+(end-start)/2;

            if(arr[mid]>key){
                end = mid-1;
            } else if(arr[mid]<key){
                ans = mid;
                start = mid+1;
            } else{
                return mid;
            }
        }
        return ans+1;
    }
}
