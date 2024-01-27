package Recursion.level2Questions;

import java.util.Arrays;

public class BuubleSortUsingRecursion {
    public static void main(String[] args) {
        int [] arr = {5,6,4,7,3,8};
        bubble(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr, int start, int end) {
        if(end == 0){
            return;
        }
        if(start<end){
            if(arr[start] > arr[start+1]){
                //swap
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
          bubble(arr,start+1,end);
        }
        bubble(arr,start,end-1);
    }
}
