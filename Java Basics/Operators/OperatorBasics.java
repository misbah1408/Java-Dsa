// //Binary Arithematic
// public class OperatorBasics {
//     public static void main(String args[]) {
//         int A = 10;
//         int B = 5;
//         System.out.println("Add = " + (A + B));
//         System.out.println("Difference = " + (A - B));
//         System.out.println("Multiplication = " + (A * B));
//         System.out.println("Division = " + (A / B));
//         System.out.println("Modulo = " + (A % B));
//     }
// }

// // Unary Arithematic
// public class OperatorBasics {
//     public static void main(String args[]) {
//         int A = 10;
//         // Post increment
//         System.out.println(A++); // 10
//         // pre increment
//         System.out.println(++A);// 11+1
//         // Post decrement
//         System.out.println(A--);// 12
//         // pre decrement
//         System.out.println(--A);// 11-1
//     }
// }

// // Relation Operator
// public class OperatorBasics {
//     public static void main(String args[]) {
//         int A = 10;
//         int B = 5;
//         // Equal Equal to
//         System.out.println(A == B);// false
//         // Not Equal to
//         System.out.println(A != B);// true
//         // Greater
//         System.out.println(A > B);// true
//         // Lesser
//         System.out.println(A < B);// false
//         // Greater then or eaqual
//         System.out.println(A >= B);// true
//         // Lesser then or eaqaul
//         System.out.println(A <= B);// false
//     }
// }

// // Complex Expressions:
// public class OperatorBasics {
//     public static void main(String args[]) {
//         int x = 2, y = 5;
//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x));
//         System.out.print(exp1 + " , ");
//         System.out.print(exp2);
//     }
// }

// // Logical AND Operator:
// public class OperatorBasics {
//     public static void main(String[] args) {
//         int x = 200, y = 50, z = 100;
//         if (x > y && y > z)/* true && false */ {
//             System.out.println("Hello");
//         }
//         if (z > y && z < x) /* true && true */ {
//             System.out.println("Java");
//         }
//         if ((y + 200) < x && (y + 150) < z)/* false && false */ {
//             System.out.println("Hello Java");
//         }
//         // Here we have used && opetator if both case are true then it executes
//         // Answer = Java
//     }
// }

// // Assignment Operators:

// public class OperatorBasics {
//     public static void main(String[] args) {
//         int x, y, z;
//         x = y = z = 2;
//         x += y;
//         y -= z;
//         z /= (x + y);
//         System.out.println(x + " " + y + " " + z); // 4 0 0
//     }
// }

// // Complex Expression Evaluation:
// public class OperatorBasics {
//     public static void main(String[] args) {
//         int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;
//         int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
//         System.out.println(exp); // 278
//     }}

// //Arithmetic Expressions:
//     public class OperatorBasics {
//         public static void main(String[] args) {
//             int x = 10, y = 5;
//             int exp1 = (y * (x / y + x / y));
//             int exp2 = (y * x / y + y * x / y);
//             System.out.println(exp1);// 20
//             System.out.println(exp2);// 20
//         }
// }
