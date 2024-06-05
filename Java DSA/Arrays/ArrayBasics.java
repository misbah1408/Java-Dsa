import java.util.*;

public class ArrayBasics {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
           marks[i] += 1;
        }
    }
    public static void main(String args[]){
        int marks[] = new int[50];
        System.out.println(marks.length);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Phy mark : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Maths mark : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Chem mark : ");
        marks[2] = sc.nextInt();
        sc.close();
        int per = ((marks[0]+marks[1]+marks[2])*100)/300;
        System.out.println("Phy marks : "+marks[0]);
        System.out.println("Maths marks : "+marks[1]);
        System.out.println("Chem marks : "+marks[2]);
        System.out.println("Persentage = "+ per+ "%" );

        int marks2[] = {99,98,97};
        update(marks2);
        for(int i=0; i<marks.length; i++){
            System.err.println(marks[i]);
        }
    }
}