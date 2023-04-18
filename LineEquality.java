//Java program to check two lines are equal or not

package demo;

public class LineEquality {
    public static void main(String[] args) {
        // Define the starting and ending points of line 1
        int x1 = 2;
        int y1 = 2;
        int x2 = 7;
        int y2 = 7;

        // Calculate the length of line 1 using the Pythagorean theorem
        double distance1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Output the length of line 1 to the console
        System.out.println("Length of line 1 is " + distance1);

        // Define the starting and ending points of line 2
        int x3 = 3;
        int y3 = 3;
        int x4 = 5;
        int y4 = 5;

        // Calculate the length of line 2 using the Pythagorean theorem
        double distance2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        // Output the length of line 2 to the console
        System.out.println("Length of line 2 is " + distance2);

        // Create two LineEquality objects to compare
        LineEquality line1 = new LineEquality();
        LineEquality line2 = new LineEquality();

        // Check if the two lines are equal using the equals method
        if (line1.equals(line2)) {
            System.out.println("The two lines are equal");
        } else {
            System.out.println("The two lines are not equal");
        }
    }
}
