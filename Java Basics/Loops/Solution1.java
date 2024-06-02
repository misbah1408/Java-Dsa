import java.util.*;
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int sumOfOdd = 0;
        int sumOfEven = 0;
        do{
        System.out.print("Enter the digits : ");
            num = sc.nextInt();
            if(num%2 == 0){
                sumOfEven = sumOfEven + num;

            }else{
                sumOfOdd = sumOfOdd + num;

            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no : ");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("Sum of even numbers: "+sumOfEven);
        System.out.println("Sum of odd numbers: "+sumOfOdd);
        sc.close();
    }
}
