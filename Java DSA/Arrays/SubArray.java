//Time Complexity O(n) for Kadane's algo
//Time Complexity O(n^2) for prefix sum
//Time Complexity O(n^3)
public class SubArray {
    public static void printSubArry(int arr[]){
        // int ta = 0;
        int prefixSum[] = new int[arr.length];
        int sum=0;
        int maxSum = 0;
        prefixSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                // Calculating Sum is Home work
                
                // for(int k=i; k<=j; k++){
                //     // System.out.print(arr[k]+ " ");
                //     sum += arr[k];
                // }
                //Home work
                sum = i == 0 ?prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                // System.out.print("(sum = "+ sum+")");
                if(maxSum < sum){
                    maxSum = sum;
                }
                sum=0;
                // System.out.println();
                // ta++;
            }
            // System.out.println();
        }
        System.out.println("Max sum = "+ maxSum);
        // System.out.println("Total Sub Arras = "+ ta);
    }
    public static void kadaneAlgo(int nums[]){
        int maxSum = nums[0];
        // Initialize currentSum to the first element of the array
        int currentSum = nums[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to the maximum of the current element and currentSum plus the current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum to the maximum of maxSum and currentSum
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-1};
        printSubArry(numbers);
        kadaneAlgo(numbers);
    }
}
