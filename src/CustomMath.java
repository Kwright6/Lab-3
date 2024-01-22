/*
Class Constraints
   - All methods & data must be static.
 */
public class CustomMath {
    // Data Items
    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;  // Euler's number

    /*
    Questions:
    1. Why is it safe to make these variables public?
        - since they are immutable (final), they are essentially read only and cannot be changed in other classes, only read/accessed.

    2. How do you access these variables from another class?
        - since they are static, you should be able to use it with the class name instead of an object.
        - Example, you could initialize a variable with PI: double pi = CustomMath.PI
     */

    // Methods
    // Returns the larger of two integer arguments.
    public static double max(double a, double b) {  // changed from int to double to allow line 100 in ClassDesignIIDriver.Java
        if (a > b) {
            return a;  // a larger
        } else if (b > a) {
            return b;  // b larger
        }

        return a;  // both equal, return a
    }

    // Returns the smaller of two integer arguments.
    public static double min(double a, double b) {
        if (a < b) {
            return a;  // a larger
        } else if (b < a) {
            return b;  // b larger
        }

        return a;  // both equal, return a
    }

    // Returns the base raised to the exponent.
    public static int pow(int base, int exp) {
        int pow = 1;

        for (int i = 0; i < exp; i++) {
            pow *= base;
        }

        return pow;
    }
}
