//Time complexity O(n^2)
public class BubbleSort {
    public static void sortDes(int nums[]){
        // int swap =0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    // swap++;
                }
            }
        }
        // System.out.println(swap);
    }
    public static void sort(int nums[]) {
        // int swap =0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    // swap++;
                }
            }
        }
        // System.out.println(swap);
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
    }
}
