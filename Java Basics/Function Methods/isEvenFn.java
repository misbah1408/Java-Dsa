import java.util.*;
//Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.Also write a program to test your method.
public class isEvenFn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        String res = isEven(num) ? "Even" : "Odd";
        System.out.println(num +" is: " + res);
        sc.close();
    }
    public static boolean isEven(int a){
        if(a%2 != 0){
            return false;
        }
        return true;
    }
}
