public class FriendsPair {
    public static int sol(int n){
        if(n == 1 || n==2){
            return n;
        }
        return sol(n-1) + (n-1) * sol(n-2);
    }
    public static void main(String[] args) {
        System.out.println(sol(3));
    }
}
