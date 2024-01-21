public class Point2D
{
    private int x;
    private int y;
    
    //default constructor (leaves x and y at 0)
    public Point2D() {}
    
    //overloaded constructor
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //copy constructor
    public Point2D(Point2D other) {
        x = other.x;
        y = other.y;
        // Question: We don't need getX() or getY() here because we are in the same class
        // and can directly access our private instance variables
    }
    
    //This method should set your private variable x equal to nX. 
    public void setX(int nX) { 
        this.x = nX;
    }
    
    //Similar to above but for y 
    public void setY(int nY) { 
        this.y = nY;
    }
    
    // This function should return a copy of your private integer x;
    public int getX() {
        // TODO: CHECK IF CORRECT
        return new Point2D(this).getX();
    }
    
    // Similar to above, but for y.
    public int getY() { 
        return new Point2D(this).getY();
    }
    
    //This function sets both x and y to zero. 
    public void resetToOrigin() {
        x = 0;
        y = 0;
    } 
    
    //This method adds dx to x, and dy to y 
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    } 
    
    @Override 
    //returns a string representation of the point 
    public String toString() { 
        return "(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object object) {
        // check if argument is an instance of Point2D
        if (!(object instanceof Point2D)) {
            return false;
        }

        Point2D otherPoint = (Point2D) object;  //type cast the argument to Point2D.

        return getX() == otherPoint.getX() && getY() == otherPoint.getY();
    }
}
