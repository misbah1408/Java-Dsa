public class QnAs {
    public static int balancedPartition(String str){
        int n = str.length();
        int count =0;
        int r=0, l=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='L'){
                l++;
            }else if(str.charAt(i) == 'R'){
                r++;
            }
            if(l == r){
                count++;
            }
        }

        return count;
    }
    public static int kthLargestOddRange(int[]p , int k){
        if(k<=0) return 0;
        int l=p[0];
        int r=p[1];
        if((r & l) > 0){
            int count = (int) Math.ceil((r-l+1)/2);
            if(count < k){
                return 0;
            }else{
                return (r-2 * k+2);
            }
        }else{
            int count = (r-l+1)/2;
            if(count < k){
                return 0;
            }else{
                return (r-2 * k+1);
            }
        }
    }
    public static void main(String[] args) {
        // Q1 Balanced partition
        String str = "LLRRRRLLRLL";
        System.out.println("Q1: " + balancedPartition(str));
        // Q2 kth largest odd number range
        int[] p = {-3, 3};
        int k = 1;
        System.out.println("Q2: " + kthLargestOddRange(p,k));
    }
}
