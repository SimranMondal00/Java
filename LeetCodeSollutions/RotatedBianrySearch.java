package LeetCodeSollutions;

public class RotatedBianrySearch {
    public static void main(String[] args) {
//        int [] arr = {4,5,6,7,0,1,2,3};
//        System.out.println(findPivot(arr));
//        System.out.println(Search(arr,5));
//    }
//
//    private static int findPivot(int[] arr) {
//        int start =0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if (mid < end && arr[mid] > arr[mid+1]) {
//             return mid;
//            }
//            else if(mid>start && arr[mid]<arr[mid+1]){
//                return mid+1;
//            }
//            else if(arr[mid]<=arr[start]){
//               end = mid-1;
//            }
//            else{
//                start = mid+1;
//            }
//        }
//        return -1;
//    }
//
//    private static int Search(int[] arr, int target) {
//        int pivot = findPivot(arr);
//        if(pivot==-1){
//            return binarySearch(arr,target,0,arr.length-1);
//        }
//       if(target>arr[0]){
//           return binarySearch(arr,target,0,pivot-1);
//       }
//      return binarySearch(arr,target,pivot+1,arr.length-1);
//    }
//
//    private static int binarySearch(int[] arr, int target, int start, int end) {
//        while(start<=end){
//            int mid = start+(end-start)/2;
//            if(target<arr[mid]){
//                end=mid-1;
//            }
//            else if(target>arr[mid]){
//                start=mid+1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;}
        int [] arr = {4,5,6,7,0,1,2,3};
        System.out.println(search(arr,0));
    }
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
