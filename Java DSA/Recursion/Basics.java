public class Basics {
    public static void printDes(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDes(n-1);
    }
    public static  void printInc(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fact = n*factorial(n-1);
        return fact;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum1 =  n+ sum(n-1);
        return sum1;
    }
    public static int fibonacci(int n){
        if(n ==0  || n == 1){
            return n;
        }
        int fib = fibonacci(n-1) + fibonacci(n-2);
        return fib;
    }
    public static boolean isSorted(int nums[], int i){
        if(i == nums.length-1){
            return true;
        }
        if(nums[i] > nums[i+1]){
            return false;
        }
        return isSorted(nums, i+1);
    }
    public static int find(int nums[], int key, int i){
        if(i == nums.length ){
            return -1;
        }
        
        if(nums[i] == key){
            return i;
        }
        return find(nums, key, i+1);
    }
    public static int last(int nums[], int key, int i){
        if(i == nums.length ){
            return -1;
        }
        int isFound = last(nums, key, i+1);
        if(isFound == -1 && nums[i] == key){
            return i;
        }
        return isFound;
    }
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        return x*pow(x, n-1);
    }
    public static int optPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPow = optPow(x, n/2);
        int halfPowSq = halfPow*halfPow;
        if( n%2 != 0){
            halfPowSq = x*halfPow;
        }
        return halfPowSq;
    }
    public static void main(String args[]){
        int n=5;
        printDes(n);
        System.out.println();
        printInc(n);
        System.out.println();
        System.out.println(factorial(n));
        System.out.println(sum(n));
        System.out.println(fibonacci(3));
        int num[] = {1,2,5,3,4,5};
        System.out.println(isSorted(num, 0));
        System.out.println(find(num,5, 0));
        System.out.println(last(num,5, 0));
        System.out.println(pow(2, 2));
        System.out.println(optPow(2, 2));
    }
}