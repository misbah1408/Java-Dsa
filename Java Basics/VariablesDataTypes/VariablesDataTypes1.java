import java.util.*;
public class VariablesDataTypes1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float avg = (a+b+c)/3;
        System.out.println("Average of entered numbers is = " + avg);
        sc.close();
    }
}
