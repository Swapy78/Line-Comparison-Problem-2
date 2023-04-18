//Java program for point class

package demo;

public class Point {
    private double x; // the x-coordinate of the point
    private double y; // the y-coordinate of the point
    
    // constructor that takes x and y coordinates as arguments
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // getter for the x-coordinate
    public double getX() {
        return x;
    }
    
    // getter for the y-coordinate
    public double getY() {
        return y;
    }
    
    // setter for the x-coordinate
    public void setX(double x) {
        this.x = x;
    }
    
    // setter for the y-coordinate
    public void setY(double y) {
        this.y = y;
    }
    
    // checks if this point is equal to the given object
    // returns true if the object is a point and has the same x and y coordinates, false otherwise
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return this.x == other.getX() && this.y == other.getY();
        }
        return false;
    }
    
    // compares this point to another point
    // returns 0 if the points have the same coordinates
    // returns -1 if this point is "less than" the other point (based on x and y coordinates)
    // returns 1 if this point is "greater than" the other point (based on x and y coordinates)
    public int compareTo(Point other) {
        if (this.x == other.getX() && this.y == other.getY()) {
            return 0;
        } else if (this.x < other.getX() || (this.x == other.getX() && this.y < other.getY())) {
            return -1;
        } else {
            return 1;
        }
    }
}
