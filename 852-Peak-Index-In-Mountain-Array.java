//Leetcode problem link - https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length-1;
        while(start<end){

            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //You are in decreasing part of the array
                end = mid;
            } else{
                //You are in increasing part of the array
                start = mid+1;
            }
        }
        return start;
    }
}
