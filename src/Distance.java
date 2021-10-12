import java.util.Scanner;


public class Distance {
    public static double distance(int x1, int y1, int x2, int y2) {return(Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))));}
       public static void main (String[] args){

           Scanner scan= new Scanner(System.in);
           System.out.print("Enter the x coordinate of the first point: ");
           int xOne= scan.nextInt();
           System.out.print("Enter the y coordinate of the first point: ");
           int yOne= scan.nextInt();
           System.out.print("Enter the x coordinate of the second point: ");
           int xTwo= scan.nextInt();
           System.out.print("Enter the y coordinate of the second point: ");
           int yTwo= scan.nextInt();
           double result = Math.sqrt(Math.pow((xTwo-xOne),2)+(Math.pow((yTwo-yOne),2)));

           System.out.println("The distance between ("+xOne+", "+yOne+") and ("+xTwo+", "+yTwo+") is "+result  );





    }





        // create the distance method below. See the instructions for the signature of the method.


        // Create your main method below. It will get the input (you will need a Scanner), call the distance
        // method, and then print the results.



}