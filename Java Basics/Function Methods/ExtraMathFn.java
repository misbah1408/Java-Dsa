public class ExtraMathFn {
    public static void main(String args[]) {
        int a = 4;
        int b = 2;
        // a.Math.min()
        System.out.println("min: " + Math.min(a, b));
        // b.Math.max()
        System.out.println("max: " + Math.max(a, b));
        // c.Math.sqrt()
        System.out.println("sqrt: " + Math.sqrt(a));
        // d.Math.pow()
        System.out.println("pow: " + Math.pow(a, b));
        // f.Math.abs()
        System.out.println("abs: " + Math.abs(a));
    }
}
/*
The Math class in Java provides a wide range of mathematical functions. Here are the types of functions available:

Basic Math Operations
    Math.abs() - Absolute value
    Math.max() - Maximum of two values
    Math.min() - Minimum of two values
    Math.addExact() - Sum of two values
    Math.subtractExact() - Difference of two values
    Math.multiplyExact() - Product of two values
    Math.incrementExact() - Increment by 1
    Math.decrementExact() - Decrement by 1
    Math.negateExact() - Negation
Exponential and Logarithmic Functions
    Math.exp() - Exponential (e^x)
    Math.expm1() - Exponential minus 1 (e^x - 1)
    Math.log() - Natural logarithm (base e)
    Math.log10() - Base 10 logarithm
    Math.log1p() - Natural logarithm of 1 plus the argument
Power and Root Functions
    Math.pow() - Power (x^y)
    Math.sqrt() - Square root
    Math.cbrt() - Cube root
    Math.hypot() - Hypotenuse (sqrt(x^2 + y^2))
Trigonometric Functions
    Math.sin() - Sine
    Math.cos() - Cosine
    Math.tan() - Tangent
    Math.asin() - Inverse sine
    Math.acos() - Inverse cosine
    Math.atan() - Inverse tangent
    Math.atan2() - Angle between the x-axis and the point (x, y)
Hyperbolic Functions
    Math.sinh() - Hyperbolic sine
    Math.cosh() - Hyperbolic cosine
    Math.tanh() - Hyperbolic tangent
    Math.asinh() - Inverse hyperbolic sine
    Math.acosh() - Inverse hyperbolic cosine
    Math.atanh() - Inverse hyperbolic tangent
Rounding Functions
    Math.ceil() - Ceiling
    Math.floor() - Floor
    Math.round() - Round to nearest integer
    Math.rint() - Round to nearest integer as a double
    Math.nextUp() - Next floating-point value towards positive infinity
    Math.nextDown() - Next floating-point value towards negative infinity
    Math.nextAfter() - Next floating-point value in the direction of another value
    Other Functions
    Math.copySign() - Copy sign of a number to another
    Math.signum() - Signum function (returns -1, 0, or 1)
    Math.ulp() - Unit in the last place (distance between floating-point numbers)
    Math.getExponent() - Exponent part of a floating-point number
    Math.scalb() - Multiply floating-point number by a power of 2
    Math.random() - Random number between 0.0 and 1.0

 */