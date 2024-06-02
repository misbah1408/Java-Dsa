/*
  * * * *
  *     *
  *     *
  * * * *
 */

// public class PatternAdvance {
//     public static void main(String args[]){
//         int n = 4;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

/*
      * 
    * *
  * * *
* * * *
 */
public class PatternAdvance {

    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

