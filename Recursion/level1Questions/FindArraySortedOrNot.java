package Recursion.level1Questions;

public class FindArraySortedOrNot {
    public static void main(String[] args) {
        int [] arr = {5,3,1,2};
        System.out.println(fun(arr,0,arr.length-1));
        System.out.println(fun2(arr,0));
    }

    private static boolean fun(int[] arr, int s, int e) {
        if (s == e) {
            return true;
        }
            if (arr[s] > arr[e]) {
                return false;
            }
            return fun(arr, s + 1, e - 1);
    }
    public static boolean fun2(int [] arr , int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && fun2(arr,index+1);
    }
}
