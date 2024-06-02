// import java.util.*;
// While loop
// public class LoopsBasics {
//     public static void main(String args[]) {
//         int counter = 0;
//         while (counter < 100){
//             System.out.println((counter + 1) + " Hello world!!");
//             counter++;
//         }
//     }
// }

// print numbers 1 to 10
// public class LoopsBasics {

//     public static void main(String args[]) {
//         int counter = 1;
//         while (counter <= 10) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }

// print number from 1 to n(user input)
// public class LoopsBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int counter = 1;
//         while (counter <= n){
//             System.out.println(counter);
//             counter ++;
//         }
//         sc.close();
//     }
// }

//Print first n natural numbers
// public class LoopsBasics {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         int i = 1;
//         while (i <= n){
//             sum +=i;
//             i ++;
//         }
//         System.out.println("Sum of first " + n + " natural numbers is " + sum);
//         sc.close();
//     }

// }

// For loop
// public class LoopsBasics {
//     public static void main(String args[]) {
//         for (int i= 1; i<=10; i++){
//             System.out.println("Hello world");
//         }
//     }
// }

//Print pattern sqaure
// public class LoopsBasics {

//     public static void main(String args[]) {
//         //for loop
//         for (int line =1; line<=4; line++){
//             System.out.println("* * * *");
//         }
//         //while loop
//         int line =1;
//         while ( line <=4 ){
//             System.out.println("* * * *");
//             line++;
//         }
//     }
// }

//Reverse a number
// public class LoopsBasics {
//     public static void main(String args[]) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter a number: ");
//         int n = 140803;
//         while (n > 0) {
//             int lastDigit = n%10;
//             System.out.print(lastDigit);
//             n /= 10;
//         }
//         for (int i=0; i <= n; i++){

//         }
//     }
// }

//Reverse a given number
// public class LoopsBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int rev = 0;
//         while( n > 0){
//             int lastDigit = n%10;
//             rev = rev*10 + lastDigit;
//             n /= 10;
//         }
//         System.out.println("Reverse of the number is: "+rev);
//         sc.close();
//     }
// }

//Do while loop
// public class LoopsBasics {
//     public static void main(String args[]) {
//         int i = 1;
//         do {
//             System.out.println("hello world");
//             i++;
//         } while (i <= 10);
//     }
// }

//Break statement
// public class LoopsBasics {
//     public static void main(String args[]) {
//         for(int i=1; i<=5; i++ ){
//             if(i == 3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("Out from the loop");
//     }
// }

//printig user input untill The number is divisible by 10
// public class LoopsBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();
//             if( n%10 == 0 ){
//                 System.out.println("The number is divisible by 10 exited");
//                 sc.close();
//                 break;
//             }
//             System.out.println(n);
//         }while(true);

//     }
// }

//Continue
// public class LoopsBasics {
//     public static void main(String args[]) {
//         //printing only even numbers
//         System.out.println("Even numbers");
//         for(int i=1; i<=100; i++ ){
//             if(i % 2 != 0){
//                 continue;
//             }
//             System.out.println(i);
//         }
//         //printing only odd numbers
//         System.out.println("Odd numbers");
//         for(int i=1; i<=100; i++ ){
//             if(i % 2 == 0){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//printig user input untill The number is divisible by 10
// public class LoopsBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("Enter a number: ");
//             int n = sc.nextInt();
//             if( n%10 == 0 ){
//                 System.out.println("The number is divisible by 10");
//                 continue;
//             }
//             System.out.println(n);
//         }while(true);

//     }
// }

//Check if a numbers is prime or not
// public class LoopsBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         if (n == 2) {
//             System.out.println(n + " is prime");
//         } else {
//             boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                 }
//             }
//             if (isPrime) {
//                 System.out.println(n + " is prime");
//             } else {
//                 System.out.println(n + " is not prime");
//             }
//         }

//     }
// }