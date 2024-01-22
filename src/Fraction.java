// TODO: 4.1 Class Constraints (CHECK IF TRUE WHEN DONE)
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
    // todo: Return a new fraction which is the sum of this fraction and the argument fraction.
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
