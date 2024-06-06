//Time complexity O(n + range)
public class CountingSort {
    public static void sortDes(int nums[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, i);
        }
        int count[] = new int[largest + 1];
        for (int i = nums.length-1; i >= 0; i--) {
            count[nums[i]]++;
        }
        int j = 0;
        for (int i = count.length-1; i >=0 ; i--) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void sort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, i);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        // for(int i=0;i<count.length;i++){
        // System.out.print(count[i] + " ");
        // }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
                // System.out.println(count[i] + " ");
            }
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
    }
}
