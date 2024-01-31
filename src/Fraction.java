/*
Class Constraints
   - Numerators and denominators are unchangeable once set by the constructor.
   - No denominator will be stored as a zero (so the code will never throw an ArithmeticException for division by zero).
   - A fraction is always in reduced form (reduce in the constructor to ensure this)..

 */
public class Fraction {
    // Data Fields
    public final int numerator; // Q: Why don’t we make this data private? A: So it can be read in another class
    public final int denominator; // Q: What data types should these items be? A: int to match sample output

    // Constructor
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            // used this so the code will never throw an ArithmeticException for division by zero)
            System.err.println("Error: Denominator cannot be zero. Setting denominator to 1.");
            this.numerator = numerator;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
    // Copy Constructor
    public Fraction(Fraction other) {
        numerator = other.numerator;
        denominator = other.denominator;
    }

    public String toString() {
        return this.numerator + "\\" + this.denominator;
    }

    // Methods
    public Fraction add(Fraction that) {
        // Declare & Initialize Variables
        int newNumerator = 0;
        int newDenominator = -1;

        if (this.numerator != this.denominator) {
            // If Uncommon Denominators: [(n1*d2)+(n2*d1)] / (d1*d2)
            newNumerator = ((this.numerator * that.denominator) + (that.numerator * this.denominator));
            newDenominator = this.denominator * that.denominator;

            return new Fraction(newNumerator, newDenominator);
        }

        // Common Denominators: (n1+n2) / d1
        return new Fraction(this.numerator + this.denominator, this.denominator);
    }

    @Override
    public boolean equals(Object other) {
        // check if other is a non-null fraction
        if (!(other instanceof Fraction) || other == null) {
            return false;
        }

        // cast the argument from Object to Fraction
        Fraction otherPoint = (Fraction) other;

        // compare the numerators and denominators of the fractions
        return numerator == otherPoint.numerator && denominator == otherPoint.denominator;
    }
}
