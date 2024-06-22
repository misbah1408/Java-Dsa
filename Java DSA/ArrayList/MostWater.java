import java.util.ArrayList;

public class MostWater {
    // Time complexity O(n^2)
    public static int storeWater(ArrayList<Integer> height) {
        int maxArea = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int curr = Math.min(height.get(i), height.get(j));
                int area = curr * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    // 2 pointer approach
    public static int storeWaterOptimized(ArrayList<Integer> height) {
        int maxArea = 0;
        int left = 0;
        int right = height.size() - 1;
        while (left < right) {
            int curr = Math.min(height.get(left), height.get(right));
            int area = curr * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    // Write a code where array is sorted and rotated pair sum
    public static boolean  pairSumOfSortedRotatedArr(int[] nums, int target) {
        int n = nums.length;
        int bp = -1;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[i+1]){
                bp = i;
                break;
            }
        }
        int left = bp+1;
        int right = bp;
        while (left != right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add 1,8,6,2,5,4,8,3,7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storeWater(list));
        System.out.println(storeWaterOptimized(list));
        int nums[] = {11,15,1,2,4,6,10};
        System.out.println(pairSumOfSortedRotatedArr(nums, 12));
    }
}
