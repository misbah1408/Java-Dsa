import java.util.*;;

// Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String res = isPalindrome(num)?  " is Palindrome " : " not a Palindrome ";
        System.out.println(num +"" + res);
        sc.close();
    }

    public static boolean isPalindrome(int number) {
        int rev = 0, temp = number;
        while( number > 0){
            int lastDigit = number%10;
            rev = rev*10 + lastDigit;
            number /= 10;
        }
        return rev == temp;
    }
}
