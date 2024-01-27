package SearchingAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={1,3,4,5,67,89};
        int target = 67;
        System.out.println("Found at index " + search(arr, target));
    }

    private static int search(int[] arr , int target) {
        int start = arr[0];
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
