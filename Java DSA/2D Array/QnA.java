public class QnA {
    //Time complexity O(n^2)
    public static int sol1(int matrix[][], int key){
        int res = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    res ++;
                }
            }
        }
        return res;
    }
    public static int sol2(int matrix[][], int row){
        int sum = 0;
        for(int i=0; i<matrix[row].length; i++){
            sum +=matrix[row][i];
        }
        return sum;
    }
    public static int[][] sol3(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] result = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        // int matrix[][] = {{4,7,8},{8,8,7}};
        // int key =1;
        // int sol1 = sol1(matrix, key);
        // System.out.println(sol1);
        // int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        // int row =2-1;
        // int sol2 = sol2(matrix, row);
        // System.out.println(sol2);
        int matrix[][] = {{1,4,9},{11,4,3}};
        int res[][] =sol3(matrix);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] +" ");
            }
            System.out.println();
        }
    }
}
