package LeetCodeSollutions;

import java.util.*;

public class LeastNumElements {
    public static void main(String[] args) {
        int [] arr = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr , k));
    }
//    public static int findLeastNumOfUniqueInts(int[] arr) {
//        if(arr.length==0){
//            return -1;
//        }
//        Arrays.sort(arr);
//        int i=0;
//        int j=i+1;
//        int count = 0;
//        while(i<=arr.length-2 && j<=arr.length-1){
//            if(arr[i]!=arr[j]){
//                count++;
//            }
//        }
//        return count;
//    }
public static int findLeastNumOfUniqueInts(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int x : arr) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }

    List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());

    elements.sort((a, b) -> a.getValue() - b.getValue());

    for (Map.Entry<Integer, Integer> entry : elements) {
        if (entry.getValue() <= k) {
            k -= entry.getValue();
            map.remove(entry.getKey());
        } else {
            break;
        }
    }
    return map.size();
}
}
