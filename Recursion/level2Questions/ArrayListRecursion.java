package Recursion.level2Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRecursion {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,4,5};
        ArrayList<Integer> ans = findAllIndex(arr,4,0, new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findAllIndex(int [] arr , int target , int index , ArrayList<Integer> list){
        if(index == arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
