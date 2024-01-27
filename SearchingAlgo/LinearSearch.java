package SearchingAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={1,3,4,5,67,89};
        int target = 3;
        System.out.println("Found at index " + search(arr, target));
    }

    private static int search(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
