// import java.util.Arrays;
// import java.util.Collections;

// Time complexity O(n^2)
public class InsertionSort {
    public static void sortDes(int nums[]){
        for(int i=1; i<nums.length; i++){
            int curr = nums[i];
            int prev = i-1;
            while (prev>=0 && nums[prev] < curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
    }
    public static void sort(int nums[]){
        for(int i=1; i<nums.length; i++){
            int curr = nums[i];
            int prev = i-1;
            while (prev>=0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
    }
    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = { 3,6,2,1,8,7,4,5,3,1 };
        sort(nums);
        printArr(nums);
        System.out.println();
        sortDes(nums);
        printArr(nums);
        // inbuilt sort methods
        // Arrays.sort(nums, Collections.reverseOrder());
        // printArr(nums);
    }
}
