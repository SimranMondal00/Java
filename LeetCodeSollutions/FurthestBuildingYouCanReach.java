package LeetCodeSollutions;

import java.util.PriorityQueue;
public class FurthestBuildingYouCanReach {
    public static void main(String[] args) {
        int [] arr = {4,12,2,7,3,18,20,3,19};
        int bricks = 10;
        int ladder = 2;
        System.out.println(furthestBuilding(arr,bricks,ladder));
    }
    public static int furthestBuilding(int[] heights, int bricks, int l) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // Max heap
        int n = heights.length;
        int i;
        for (i = 0; i < n - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                if (bricks >= diff) {
                    bricks -= diff;
                    pq.offer(diff);
                } else if (l > 0) {
                    if (!pq.isEmpty() && pq.peek() > diff) {
                        int top = pq.poll();
                        bricks += top - diff;
                        pq.offer(diff);
                        l--;
                    } else {
                        l--;
                    }
                } else {
                    break;
                }
            }
        }
        return i;
    }
}
