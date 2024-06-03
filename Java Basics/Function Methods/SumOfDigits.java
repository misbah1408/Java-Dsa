import java.util.*;
public class SumOfDigits { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sumOfDigits = SumOfDigitsFn(n);
        System.out.println("Sum of digits of " + n + " is " + sumOfDigits);
        sc.close();
    }
    public static int SumOfDigitsFn(int number){
        int sum = 0;
        while( number > 0){
            int lastDigit = number%10;
            sum += lastDigit;
            number /= 10;
        }
        return sum;
    }
}
