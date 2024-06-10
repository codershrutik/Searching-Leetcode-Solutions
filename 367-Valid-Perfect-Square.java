//Leetcode problem link - https://leetcode.com/problems/valid-perfect-square/description/
class Solution {
    public boolean isPerfectSquare(int num) {
        return binarySearch(num);
    }

    public boolean binarySearch(int num){
        long start = 1;
        long end = num;

        while(start<=end){
            long mid = start+(end-start)/2;
            long square = mid*mid;

            if(square == num){
                return true;
            } else if(mid*mid<num){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return false;
    }
}
