import java.awt.Color;
import java.awt.Graphics;

/* Constraints:
    - x and y must be integers
    - x and y must be non-negative
    - x and y must be lower than 1000
    - the color must be a java default?
 */

public class Shape {
    // Declare & Initialize Variables
    private int x;
    private int y;
    private Color color;  // private or not?

    // Constructors
    public Shape(){
        x = 0;
        y = 0;
        color = Color.GREEN;
    }

    public Shape(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // Copy Constructor
    public Shape(Shape other){
        x = other.x;
        y = other.y;
        color = other.color;
    }

    // Instance Methods
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        // Returns a string that describes the x and y coordinates and the color of this shape.
        // For example, a blue shape at (10, 200) should return "Shape (10, 200) blue"

        return "Shape (" + this.x + ", " + this.y + ") " + this.color;
    }

    // Since we can't compute the area of the shape without knowing
    // what kind of shape it is, this method should just return -1.
    public double getArea() {
        // Since we can't compute the area of the shape without knowing
        // what kind of shape it is, this method should just return -1.

        return -1;  // Subclasses will override this method to return a useful value.
    }

    // This method takes a Graphics object as an argument.
    public void draw(Graphics g) {
        // Later, we will learn how to use the Graphics object to draw shapes,
        // but for now, the body of the method will be empty
    }
}
