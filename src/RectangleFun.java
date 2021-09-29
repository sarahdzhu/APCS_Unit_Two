import java.awt.*;
import java.util.Scanner;

public class RectangleFun {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        // Create a scanner object to be able to get input from the user
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();
        System.out.print("Width: ");
        int width =scan. nextInt();
        System.out.print("Height: ");
        int height= scan.nextInt();
        // Get input for x, y, width, and height. Create four separate variables for these.
        // Create a Rectangle object using the four pieces of user input.
        Rectangle r= new Rectangle(x,y,width,height);

        // Use the appropriate methods (getWidth() and getHeight() ) to calculate the perimeter, then print it
        double perimeter =(2*r.getHeight()+2*r.getWidth());
        System.out.println("Perimeter = "+perimeter);
         r.setLocation ((int)(r.getX())-4,(int)(r.getY()-2));

        System.out.println("New location is ("+r.getX()+", "+r.getY()+")" );





        // Use getX(), getY(), and setLocation() to move the Rectangle. Print the new location.

    }
}
