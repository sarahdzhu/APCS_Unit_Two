import java.awt.*;

public class GrowSquarePrinter {

    public static void main(String[] args) {

        // Create a Rectangle object with a starting x, y of (100, 100) and a width and height of 50.
Rectangle r = new Rectangle(100,100,50,50 );

        // print the rectangle object.
        System.out.println(r);


        // Use the translate and grow methods as described in the instructions
        r.translate(25,25);
        r.grow(25,25);

        // print the rectangle object.
        System.out.println(r);

    }
}
