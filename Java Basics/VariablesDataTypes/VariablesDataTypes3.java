import java.util.*;

public class VariablesDataTypes3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of Pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter the price of Eraser: ");
        float eracer = sc.nextFloat();
        float total = pencil+pen+eracer;
        System.out.println("Total price of the items: "+total);
        float gstValue = total+(0.18f * total);
        System.out.println("Total price with gst: "+gstValue);
        sc.close();
    }
}
