
public class Basics {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 1) {
            System.out.println("Its odd");
        } else {
            System.out.println("Its even");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            // System.out.println(n);
            // System.out.println(n&bitMask);
            // System.out.println(bitMask);
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0){
        // return clearIthBit(n, newBit);
        // }else{
        // return setIthBit(n, newBit);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIthBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearInRangebits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        return n & (a | b);
    }

    public static boolean isPowerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int n, int a) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println((~5));
        System.out.println(5 << 2);
        System.out.println(6 >> 1);
        oddOrEven(2);
        System.out.println(getIthBit(15, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLastIthBit(15, 2));
        System.out.println(clearInRangebits(10, 2, 7));
        System.out.println(isPowerOf2(3));
        System.out.println(countSetBit(15));
        System.out.println(fastExpo(5, 3));
        System.out.println(Math.pow(3, 5));
        System.out.println(5&4);
    }
}
