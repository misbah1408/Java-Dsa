// import java.util.*;
// public class Basics {
//     public static void main(String[] args) {
//         // int age = 22;
//         int age = 17;
//         if (age >=18 ) {
//             System.out.println("Adult");
//         }if (age >= 13 && age <= 17){
//             System.out.println("Teenager");
//         }
//         else {
//             System.out.println("Not Adult");
//         }
//     }
// }

// // Print largest of 2 numbers
// public class Basics {
//     public static void main(String[] args) {
//         int A = 5;
//         int B = 3;
//         if (A > B) {
//             System.out.println("A is largest of 2");
//         } else {
//             System.out.println("B is largest of 2");
            
//         }
//     }
// }

// //Print Odd or even
// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if (num % 2 == 0){
//             System.out.println("Even");
//         }else{
//             System.out.println("Odd");
//         }
//         sc.close();
//     }
// }

// //Else if
// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age :");
//         int age = sc.nextInt();
//         if (age >= 18) {
//             System.out.println("Adult");
//         }else if (age >= 13 && age < 18){
//             System.out.println("Teenager");
//         }else {
//             System.out.println("Child");
//         }
//         sc.close();
//     }
// }


// //Income tax calculator
// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your income :");
//         int income = sc.nextInt();
//         int tax = 0;
//         if(income < 500000 ){
//             System.out.println("No tax");
//         } else if(income >= 500000 && income < 1000000 ){
//             System.out.print("Tax is 20% = ");
//             tax = (int)(income * 0.2);
//             // System.out.print((int)(income*0.2)); 
//         } else {
//             System.out.print("Tax is 30% = ");
//             tax = (int)(income * 0.3);
//             // System.out.print((int)(income*0.3));
//         }
//         System.out.println("Tax = " + tax);
//         sc.close();
//     }
// }

// //Print largest of 3
// public class Basics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 1st number :");
//         int a = sc.nextInt();
//         System.out.print("Enter 2nd number :");
//         int b = sc.nextInt();
//         System.out.print("Enter 3rd number :");
//         int c = sc.nextInt();

//         if(a>b && a>c){
//             System.out.println("Largest number is " + a);
//         }else if(b>c){
//             System.out.println("Largest number is " + b);
//         }else{
//             System.out.println("Largest number is " + c);
//         }
//         sc.close();
//     }
// }

// //Ternary operator
// public class Basics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number :");
//         int a = sc.nextInt();
//         String result = (a%2 == 0) ? "Even" : "Odd" ;
//         System.out.println(a + " is " + result);
//         sc.close();
//     }
// }

// //Check if student Pass or Fail using Ternary Operator
// public class Basics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter marks : ");
//         int marks = sc.nextInt();
//         String result = (marks>=33) ? "Pass" : "Fail";
//         System.out.println("Result is " + result);
//         sc.close();
//     }
// }

// //Switch case basics
// public class Basics {

//     public static void main(String[] args) {
//         int number = 8;
//         switch (number) {
//             case 1: System.out.println("Samosa");
//             break;
//             case 2: System.out.println("Burger");
//             break;
//             case 3: System.out.println("Pizza");
//             break;
//             default: System.out.println("Nothing");
//         }
//     }
// }

// //Calculator using switch case
// public class Basics {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number : ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number : ");
//         int num2 = sc.nextInt();
//         System.out.println("1 : Addition +");
//         System.out.println("2 : Substrction -");
//         System.out.println("3 : Multiplication x");
//         System.out.println("4 : Division /");
//         System.out.println("5 : Modulo %");
//         System.out.print("Enter your choice : ");
//         int choice = sc.nextInt();
//         switch (choice) {
//             case 1: System.out.println("Addition = " + (num1 + num2));
//             break;
//             case 2: System.out.println("Substrction = " + (num1-num2));
//             break;
//             case 3: System.out.println("Multiplication = "+ (num1*num2));
//             break;
//             case 4: System.out.println("Divison = "+ (num1/num2));
//             break;
//             case 5: System.out.println("Modulo = "+ (num1%num2));
//             break;
//             default: System.out.println("Enter valid choice");
//         }
//         sc.close();
//     }
// }