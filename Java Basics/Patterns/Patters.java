//Star right angled
// public class Patters {
//     public static void main(String[] args) {
//         for (int i=1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted Star
// public class Patters {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//Half-Pyramid
// public class Patters {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Print Character pattern
public class Patters {

    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int i=1; i<= n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
} 