package Recursion.level1Questions;

public class FirstIndex {
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(find(arr, 5,0));
    }

    //for boolean value
    private static int find(int[] arr, int target, int i) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return find(arr,target,i+1);
    }

    //for index and array sorted in ascending order
    static int findIndexAss(int [] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return find(arr,target,index+1);
    }

    // for index and array sorted in descending order
    static int findIndexLast(int [] arr , int target , int index){
        if(index == -1){
            return -1;
        }
        else{
            findIndexLast(arr , target , index-1);
        }
        return index;
    }
}
