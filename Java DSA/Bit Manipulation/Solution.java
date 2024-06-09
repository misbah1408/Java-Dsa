public class Solution {
    public static void swap(int a, int b){
        System.out.println("Before swapping a:"+a+ " b:" + b );
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping a:"+a+ " b:" + b );
    }
    public static void main(String[] args) {
        swap(10, 5);
    }
}
