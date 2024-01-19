import java.awt.Color;

// TODO: Declare 4 class constraints for the Shape class as comments
/* Constraints:
    - x and y must be integers
    - x and y must be non-negative
    - the color must be a java default?
    - limit the size?
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

    // TODO: 1.4 Instance Methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // TODO: public String toString();
    // Returns a string that describes the x and y coordinates and the color of this shape.
    // For example, a blue shape at (10, 200) should return "Shape (10, 200) blue"

    // TODO: public double getArea();
    // Since we can't compute the area of the shape without knowing what kind of shape it is, this method should just return -1.
    // Subclasses will override this method to return a useful value.

    // TODO: public void draw(Graphics g);
    // This method takes a Graphics object as an argument.
    // Later, we will learn how to use the Graphics object to draw shapes, but for now, the body of the method will be empty

}
