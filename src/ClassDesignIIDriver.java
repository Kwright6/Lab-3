import java.awt.*;

/*
 * Lab2 Driver:   ClassDesignIIDriver.java
 * Author: Rob Nash
 * 
 * Purpose: This is a test file to be included in the same (working) directory as your 
 * new class definitions.  Once you define a class (say, the Date class), uncomment the driver code
 * associated with that class to test it.  Match your output with the provided output, and pay 
 * particular attention to each new technique as we make use of it (Overloading, Constructors, Copy 
 * Constructors, Access Modifiers, Class Invariants, etc.)
 * 
 */


public class ClassDesignIIDriver {
    private int foo = -1;  //used in one of the mutator functions below
    
    
    public static void main(String[] args) {
        //uncomment the desired Driver or Demo below and run this code to test your progress
        //shapeDriver();
        //lineSegmentDriver();
        //immutableFractionDriver();
        //customMathDriver();
        passByReferenceDemo();
    }

    private static void shapeDriver() {
        // System.out.println("uncomment the code to use the shapeDriver");

        Shape a = new Shape();
        Shape b = new Shape(10, 10, Color.DARK_GRAY);
        
        a.setX(120);
        b.setY(140);
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    
    public static void lineSegmentDriver() {
        //System.out.println("uncomment the code to use the lineSegmentDriver");
        LineSegment a = new LineSegment();
        LineSegment b = new LineSegment(new Point2D(1,1), new Point2D(2,2));
        LineSegment c = new LineSegment(b);
        
        a.setStart(new Point2D(3, 3));
        a.setEnd(new Point2D(4, 4));
        
        System.out.println("Line a: " + a.toString());
        System.out.println("Line b: " + b.toString());
        System.out.println("Line c: " + c.toString());
        
        System.out.println("Line b's distance between points: " + b.getDistance());
        
        System.out.println("Does a equal b? " + a.equals(b));
        System.out.println("Does a equal c? " + a.equals(c));
        System.out.println("Does b equal c? " + b.equals(c));

    }
    
    
    public static void immutableFractionDriver() {
        //System.out.println("Uncomment the code to use the immutableFractionDriver");
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(3, 4);
        Fraction c = new Fraction(b);
    
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        
        // fix the following 2 errors
        //System.out.println("a.num:" + a.getNum());
        System.out.println("a.num: " + a.numerator);
        System.out.println("b.denom: " + b.denominator);
        
        
        // which of the following code is correct to change the fraction a?
        a.add(b);
        a = a.add(b);  // this one will change fraction 'a' as we return a new fraction object that gets stored in 'a'
        
        System.out.println("a: " +a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("b.equals(c): " + b.equals(c));
    }

    private static void customMathDriver() {
        //System.out.println("uncomment the code to use the customMathDriver");

        double a = CustomMath.PI;
        double b = CustomMath.E;
        double c = a + b;
        
        System.out.println("The larger of the two is " + CustomMath.max(10, 20));
        System.out.println("And the larger of the two is " + CustomMath.max(10.34, 10.31));
        System.out.println("2^8 is " + CustomMath.pow(2, 8));

    }
    
    public static void passByReferenceDemo() {
        int a = 3;                      // a primitive variable
        Dimension b = new Dimension();  // a reference variable
        
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);
        
        mutate(a);
        mutate(b);
        
        System.out.println("a is :"+ a);
        System.out.println("b is :" + b);

        /*
        Questions:
        a. What is the primary difference between passing a primitive to a method versus passing an object?
            - When you pass a primitive type, you pass the literal value and anything done with it in the method does NOT change the value of the original variable in main.
              When you pass an object, you pass its reference value meaning any changes to that object's values in that method will change the values of the original object in main.

        b. When a primitive is passed to a method, does the scope of that primitive change (i.e., grow to include the called method)?
            - No

        c. What about when an object is passed to a method?
            - No but any changes to it will affect the object in main unless it's initiated to point to a new object reference

        d. How then would you describe the scope of an object that has been passed to a method?
            - Still local to the method but it's connected to the original object unless changed.
        */
    }
    
    public static void mutate(int z) {  //does it matter that I called my input data "z" here? A. No
        z = -1000;  // if z is only a copy, this won't affect the variable a's value in main
        
        //this.foo = -1000;
        // why does the line above cause compiler errors? A. because it is a non-static variable in a static class
    }
    
    public static void mutate(Dimension c) {  
        c.height = -1000;
        c.width = -1000;
        //if I didn't hand this function a copy of b from main, but rather a reference to the object that is known in main as b, what happens here?
            // A. it will change the values of the object known as main in b
        //if I make a change to c, are my changes reflected back in the code that called this function?  In other words, did this change b of main?
            // A. Yes
    }
}