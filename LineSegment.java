//Java program for Line class

package demo;

/**
 * Represents a line segment in two-dimensional space, defined by its start and end points.
 */
public class LineSegment {
    private Point start;
    private Point end;
    
    /**
     * Constructs a new LineSegment object with the given start and end points.
     * @param start The start point of the line segment.
     * @param end The end point of the line segment.
     */
    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    
    /**
     * Returns the start point of the line segment.
     * @return The start point of the line segment.
     */
    public Point getStart() {
        return start;
    }
    
    /**
     * Returns the end point of the line segment.
     * @return The end point of the line segment.
     */
    public Point getEnd() {
        return end;
    }
    
    /**
     * Sets the start point of the line segment.
     * @param start The new start point of the line segment.
     */
    public void setStart(Point start) {
        this.start = start;
    }
    
    /**
     * Sets the end point of the line segment.
     * @param end The new end point of the line segment.
     */
    public void setEnd(Point end) {
        this.end = end;
    }
    
    /**
     * Calculates and returns the length of the line segment.
     * @return The length of the line segment.
     */
    public double length() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    /**
     * Checks whether this line segment is equal to the given object.
     * Two line segments are equal if their start and end points are equal.
     * @param obj The object to compare to this line segment.
     * @return True if the object is equal to this line segment, false otherwise.
     */
    public boolean equals(Object obj) {
        if (obj instanceof LineSegment) {
            LineSegment other = (LineSegment) obj;
            return this.start.equals(other.getStart()) && this.end.equals(other.getEnd());
        }
        return false;
    }
    
    /**
     * Compares the length of this line segment to the length of the given line segment.
     * @param other The other line segment to compare to.
     * @return 0 if the two line segments have the same length, 
     *         a negative integer if this line segment is shorter than the other,
     *         a positive integer if this line segment is longer than the other.
     */
    public int compareTo(LineSegment other) {
        if (this.length() == other.length()) {
            return 0;
        } else if (this.length() < other.length()) {
            return -1;
        } else {
            return 1;
        }
    }
}
