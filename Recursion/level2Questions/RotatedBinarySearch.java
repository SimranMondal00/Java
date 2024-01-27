package Recursion.level2Questions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3};
        System.out.println(Search(arr,2,0,arr.length -1));
    }

    private static int Search(int[] arr, int target, int start, int end) {
      if(start > end){
          return -1;
      }
      int mid = start + (end-start)/2;
      if(target == arr[mid]){
          return mid;
      }
      if(start <= mid){
          if(target >= arr[start] && target <= arr[mid]){
              return Search(arr,target,start,mid-1);
          }
          return Search(arr,target,mid+1,end);
      }
      if(target >= arr[mid] && target <= arr[end]){
          return Search(arr,target,mid+1,end);
      }
      return Search(arr,target,mid,end-1);
    }
}
