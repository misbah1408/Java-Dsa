//Time complexity O(n^2)
public class SelectionSort {
    public static void sortDes(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minPos]<nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i]=temp;
        }
    }
    public static void sort(int nums[]) {
        for(int i=0; i<nums.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[minPos]>nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i]=temp;
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

