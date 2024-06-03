import java.util.*;
// Write a Java method to compute the average of three numbers.
public class AverageFn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number : ");
        double num3 = sc.nextDouble();

        double avrNums = averageOfThree(num1, num2, num3);
        System.out.println(avrNums);
        sc.close();
    }
    public static double averageOfThree(double a, double b, double c){
        double avrNums = (a+b+c)/3;
        return avrNums;
    }
}
