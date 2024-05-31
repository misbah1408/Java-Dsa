import java.util.*;
public class VariablesDataTypes2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square :");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of a square is : "+area);
        sc.close();
    }
}
