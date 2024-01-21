/*
Class Constraints
   - The instance variables of a line segment are never null.
   - The start and end points of a line segment always have nonnegative coordinates (x, y >= 0).
 */

public class LineSegment {
    // Data Fields
    private Point2D start;
    private Point2D end;

    // Constructors
    public LineSegment() {
        start.setX(0);
        end.setY(0);
    }

    public LineSegment(Point2D start, Point2D end) {
        // check if non-null and non-neg coordinates
        if (start != null && end != null) {
            if (start.getX() > 0 && start.getY() > 0 && end.getX() > 0 && end.getY() > 0) {
                this.start = start;
                this.end = end;
            }
        }
    }

    // Copy Constructor
    public LineSegment(LineSegment other) {
        // Set this LineSegment to have points with the same coordinates as the points of other
        // Use the Point2D copy constructors???
        this.start = new Point2D(other.start);
        this.end = new Point2D(other.end);
    }

    // Getters & Setters
    public Point2D getStart() {

        return new Point2D(getStart());
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return new Point2D(getEnd());
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    // Other Methods
    public String toString() {
        //Call the toString method from your Point2D class to get the coordinates for each point.
        // format: "Line start: (x, y) end: (x, y)"
        return "Line start: " + start.toString() + " end: " + end.toString();
    }

    //A method that determines if two LineSegments are equal
    public boolean equals(Object other) {
        if(other == null || !(other instanceof LineSegment))
            return false; //use this as the first line
        LineSegment that = (LineSegment) other; //after this line, use this v.s. that

        //return start and end points are equal, requires an equals in the Point2D class
        return this.start.equals(that.start) && this.end.equals(that.end);
    }

    public double getDistance() {
        // Returns the Euclidean distance between the start point and end point.

        int x1 = start.getX();
        int y1 = start.getY();
        int x2 = end.getX();
        int y2 = end.getY();

        return Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));  // sqrt((x2 - x1)^2 + (y2 - y1)^2
    }

    /*
    Questions
       What is a privacy leak?
       - A privacy leak is when data that isn't meant to be accessed or modified
       can get accessed either by a user or another part of the program.

       Do your getters or setters have privacy leaks?
       - My getters in Point2D did but I think I fixed them. The setters still might, I'm not quite sure.

       Where else could a privacy leak occur?
       - In public methods, returning reference values, through inheritance
 */
}
