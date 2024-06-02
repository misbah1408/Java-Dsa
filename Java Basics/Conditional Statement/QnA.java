// import java.util.*;
// //Write a Java program to get a number from the user and print whether it is positive or negative.
// public class QnA {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number : ");
//         int num = sc.nextInt();
//         if( num >= 0){
//             System.out.println("Its positive");
//         }else{
//             System.out.println("Its negative");
//         }
//         sc.close();
//     }
// }

// //Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

// public class QnA {
//     public static void main(String args[]) {
//         double temp = 103.5;//Given
//         if(temp> 100){
//             System.out.println("Fever");
//         }else{
//             System.out.println("No Fever");
//         }
//     }
// }

// //Write a Java program to input week number(1-7) and print day of week name using switch case.
// public class QnA {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number between 1-7 : ");
//         int num = sc.nextInt();
//         switch(num){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wendnesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Satuarday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default :
//                 System.out.println("Invalid number");
//         }
//         sc.close();
//     }
// }

// //Write a Java program that takes a year from the user and print whether that year is a leap year or not.

// public class QnA {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter year : ");
//         int year = sc.nextInt();
//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100) != 0;
//         boolean z = ((year % 100 == 0) && (year % 400 == 0));
//         if (x && (y || z)) {
//             System.out.println("Leap year");
//         } else {
//             System.out.println("Leap year");
//         }
//         sc.close();
//     }
// }