//Amazon interview question
public class Main{
  public static void main(String[] args){
      //start with the box of size 2
    int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
    int target = 10;
    System.out.println(arr, target);
  }

  static int ans(int[] arr, int target){
    //First find the range
    //First start with a box of size 2
    int start = 0;
    int end = 1;

    //condition for target to lie in the range
      while(target>arr[end]){
        end = end+(end-start+1)/2;
        start = temp;
      }

    return infiniteArray(arr, target, start, end);
  }
  
  static int infiniteArray(int[] arr, int target, int start, int end){
    while(start<=end){
        int mid = start + (end-start/2);

        if(target<int[mid]){
            end = mid-1;
        } else if(target>arr[mid]){
            start = mid+1;
        } else{
          return mid;
        }
    } 
  }
}
