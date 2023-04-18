//Java program to compare two lines

package demo ;

public class CompareLines {

    public static void main(String[] args) {
        // Define the coordinates of the first line
        int x1 = 2;
        int y1 = 2;

        int x2 = 7;
        int y2 = 7;

        // Calculate the distance between the two points using the distance formula
        double distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        // Print the length of the first line
        System.out.println("Length of first line is " + distance1);

        // Define the coordinates of the second line
        int x3 = 3;
        int y3 = 3;

        int x4 = 5;
        int y4 = 5;

        // Calculate the distance between the two points using the distance formula
        double distance2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        // Print the length of the second line
        System.out.println("Length of second line is " + distance2);

        // Compare the lengths of the two lines using the compareTo method
        int compareValue = Double.compare(distance1, distance2);
        if(compareValue > 0) {
            System.out.println("First line is greater than second line");
        } else if(compareValue < 0) {
            System.out.println("First line is less than second line");
        } else {
            System.out.println("Both lines are equal");
        }
    }
}
