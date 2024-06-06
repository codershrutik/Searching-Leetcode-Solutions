//Leetcode problem link - https://leetcode.com/problems/find-the-peaks/
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        
        int n = mountain.length;

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && i<(n-1)){
                if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                    list.add(i);
                }
            }
        }
        return list;
    }
}
