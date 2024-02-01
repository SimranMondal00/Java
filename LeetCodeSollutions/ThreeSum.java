package LeetCodeSollutions;
import java.util.Arrays;
public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(arr,target));
    }



        public static int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            if (nums.length < 3) {
                return -1; // Handle cases where the input array has less than 3 elements
            }
            int closestSum = nums[0] + nums[1] + nums[2]; // Initialize closestSum with the sum of the first three elements
            for (int i = 0; i < nums.length - 2; i++) {
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[start] + nums[end];
                    if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                        closestSum = sum; // Update closestSum if the current sum is closer to the target
                    }
                    if (sum < target) {
                        start++; // Increment start if sum is less than target
                    } else if (sum > target) {
                        end--; // Decrement end if sum is greater than target
                    } else {
                        return sum; // Return early if sum equals target
                    }
                }
            }
            return closestSum;
        }
}
