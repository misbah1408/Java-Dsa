import java.util.*;;

public class FunctionBasics {
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static int sum(int a, int b) {
        // System.out.println(a+b);
        int sum = a + b;
        return sum;
    }

    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Function Overloading (type params) does not depend on return type
    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static float product(float a, float b) {
        float product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int biCo(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n - r);
        int biCo = factN / (factR * factNR);
        return biCo;
    }

    public static boolean primeOrNot(int n) {
        // for(int i=2; i<n-1; i++){
        // if(n%i==0){
        // return false;
        // }
        // }
        // Optimized
        if (n == 2) {
            return true;
        } 
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        
        return true;
    }
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(primeOrNot(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void binaryToDecimal(int n){
        int num = n;
        int decimal = 0;
        int pow=0;
        while (n > 0){
            int lastDigit = n%10;
            decimal += lastDigit * (int)Math.pow(2, pow);
            n /= 10;
            pow++;
        }
        System.out.println("Decimal of "+num+" = " +decimal);

    }
    public static void decimalToBinary(int n){
        int num = n;
        int binary = 0;
        int pow=0;
        while (n > 0){
            int rem = n%2;
            binary += rem * (int)Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        System.out.println("Binary of "+num+" = " + binary);
    }
    public static void main(String[] args) {
        // printHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        // System.out.print("Enter number : ");
        // int b = sc.nextInt();
        // int swap = swapNumbers(a, b);
        // System.out.println(swap);
        // int product = product(a, b);
        // System.out.println(product);
        // int factN = factorial(a);
        // System.out.println("Factorial of " + a+"!" + " = " +fact);

        // int biCo = biCo(a, b);
        // System.out.println("The binomial coefficient of "+a+"C"+b+" is "+biCo );
        // int productInt = product(a, b);
        // float productFloat = product(a, b);
        // System.out.println("The product of INT "+a+" and "+b+" is "+productInt);
        // System.out.println("The product of FLOAT "+a+" and "+b+" is "+productFloat);
        // String isPrime = primeOrNot(a) ? " -> Prime" : " -> Not Prime";
        // System.out.println("Is " + a + " prime? " + isPrime);
        // primeInRange(a);
        // binaryToDecimal(a);
        decimalToBinary(a);
        sc.close();
    }
}
