import java.awt.*;
import java.util.Scanner;

public class PointsAndRectangles {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // create print statements and get input for the x and y values.
        System.out.print("Enter the x coordinate: ");
        int x = scan.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y = scan.nextInt();
        Point p = new Point(x, y);



        System.out.print("Enter the length: ");
        int width = scan.nextInt();
        System.out.print("Enter the width: ");
        int height = scan.nextInt();
        Dimension d = new Dimension(width, height);
        Rectangle r = new Rectangle(x,y,width,height);
        System.out.println(p);
        System.out.println(d);
        System.out.println(r);
















        //Instantiate a Point object p. Hint: you will need the keyword "new"


        // create print statements and get input for the length and width

        //Instantiate a Dimension object d.

        //Instantiate a Rectangle object r.

        // Print each object p, d, and r on a separate line.
    }
}