package demo;

public class Line {
    public static void main(String[] args) {
        // Define the starting and ending points of the line segment
        int x1 = 2;
        int y1 = 2;
        int x2 = 7;
        int y2 = 7;

        // Calculate the distance between the two points using the Pythagorean theorem
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Output the length of the line segment to the console
        System.out.println("Length of line is " + distance);
    }

    public Object getStart() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object getEnd() {
        // TODO Auto-generated method stub
        return null;
    }

    public double length() {
        // TODO Auto-generated method stub
        return 0;
    }
}
