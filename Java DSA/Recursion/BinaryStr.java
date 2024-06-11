public class BinaryStr {
    public static void sol(int n,int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        sol(n-1, 0, str+"0");
        if(lastPlace == 0){
            sol(n-1, 1, str+"1");
        }
    }
    public static void sol2(int n,int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        sol2(n-1, 1, str+"1");
        if(lastPlace == 1){
            sol2(n-1, 0, str+"0");
        }
    }
    public static void main(String[] args) {
        sol(3, 0, "");
        System.out.println();
        sol2(3, 1, "");
    }
}
