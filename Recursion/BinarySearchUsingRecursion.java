package Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {23,47,89,93};
        int target = 89;
        System.out.println("Found at index " + Search(arr,target,0,arr.length-1));
    }

    private static int Search(int[] arr, int target, int s, int e) {
        if(arr.length==0){
            return -1;
        }
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<s){
           return Search(arr,target,s,m-1);
        }
       return Search(arr,target,m+1,e);
    }
}
