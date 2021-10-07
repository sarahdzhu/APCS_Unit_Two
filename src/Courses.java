import java.util.Scanner;
public class Courses {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);

    System.out.print("What is the description of the course? ");
    String description= scan.nextLine();

    int des= description.indexOf(" ");

    description.indexOf(" ", des+1);





    System.out.println("Department: "+ description.substring(0,(description.indexOf(" ")+1)));
    System.out.print("Course Number: "+ description.substring(description.indexOf(" ", des+1)));




}}
