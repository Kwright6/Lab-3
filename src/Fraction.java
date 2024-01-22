// TODO: 4.1 Class Constraints (CHECK IF TRUE WHEN DONE)
/*
Class Constraints
   - Numerators and denominators are unchangeable once set by the constructor.
   - No denominator will be stored as a zero (so the code will never throw an ArithmeticException for division by zero).
   - A fraction is always in reduced form (reduce in the constructor to ensure this)..

 */
public class Fraction {
    // Data Fields
    public final double numerator; // Q: Why don’t we make this data private? A: So it can be read in another class
    public final double denominator; // Q: What data types should these items be? A: double or float if we want more precision

    // Constructor
    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // Copy Constructor
    public Fraction(Fraction other) {
        numerator = other.numerator;
        denominator = other.denominator;
    }

    public String toString() {
        return this.numerator + "\\" + this.denominator;
    }

    // TODO: 4.4 Methods
    public Fraction add(Fraction that) {
        // todo:
        //      Returns a new fraction which is the sum of this fraction and the argument fraction.
        //      This method is tricky! Review how to add fractions, and consider writing helper methods which you can call in add.
        return new Fraction(0,0);  // todo: placeholder
    }

    public boolean equals(Object other) {
        // todo:
        /*  - Indicates whether this fraction is equal to the specified fraction.
            - Since Fraction is a subclass of Object, it inherits an equals method from Object which takes an Object as an argument.
                - Our new method will override the Object method, so our method has to take an Object argument as well.
                - So, we start the method by making sure the argument is a non-null Fraction, and if so, we cast the argument from Object to Fraction.
                - Then, we compare the numerators and denominators of the fractions.
         */
        return false;
    }
}
