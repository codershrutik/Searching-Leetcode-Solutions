//Link to question - https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class search{

    public static void main(String[] args){
        int arr[] = { 15, 18, 2, 3, 6, 12 }; 
        int n = arr.length; 
  
        System.out.println(countRotations(arr, n)); 
    }

    public static int countRotations(int[] arr, int n){
        int pivot = findPivotWithDuplicates(arr);
        return pivot+1;
        }


    public static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
