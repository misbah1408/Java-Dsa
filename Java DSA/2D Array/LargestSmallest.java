
public class LargestSmallest {
    public static void findLargestSmallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest = "+ largest);
        System.out.println("Smallest = "+ smallest);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        findLargestSmallest(matrix);
    }
}
