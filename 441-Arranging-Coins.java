//Leetcode problem link - https://leetcode.com/problems/arranging-coins/description/
class Solution {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        long mid,current;

        while(left<=right){
            mid = left+(right-left)/2;
            current = mid*(mid+1)/2;

            if(current == n){
                return (int)mid;
            } else if(current<n){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return (int)right;
    }
}
