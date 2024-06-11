public class Tiling {
    public static int tilingSol(int n){
        //base
        if(n ==0 || n ==1){
            return 1;
        }
        //work
        //vertical
        // int fnm1 = tilingSol(n-1);
        // //horizonal
        // int fnm2 = tilingSol(n-2);

        // int tolWays = fnm1 + fnm2;
        // return tolWays; 
        return tilingSol(n-1) + tilingSol(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingSol(4));
    }
}
