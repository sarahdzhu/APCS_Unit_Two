import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the first and last names as separate variables (use the Scanner object to get the input)
        System.out.print("First name: ");
        String firstName= scan.nextLine();
        System.out.print("Last name: ");
        String lastName= scan.nextLine();
        System.out.println(firstName+" "+lastName);




        // Use the required string methods to print out the information
        firstName.length();
        lastName.length();
        System.out.println(firstName.length()+lastName.length());
        firstName.substring(0,1);
        lastName.substring(0,1);
        System.out.println(firstName.substring(0,1)+lastName.substring(0,1));
        firstName.compareTo(lastName);
        System.out.println(firstName.compareTo(lastName));
        firstName.charAt(firstName.length()-1);
        lastName.lastIndexOf(firstName.charAt(firstName.length()-1));
        System.out.println( lastName.lastIndexOf(firstName.charAt(firstName.length()-1)));
        lastName.charAt(lastName.length()-1);
        firstName.lastIndexOf(lastName.charAt(lastName.length()-1));
        System.out.println(firstName.lastIndexOf(lastName.charAt(lastName.length()-1)));
        int mid1= firstName.length()/2;
        int mid2= lastName.length()/2;
        firstName.substring(0,mid1);
        lastName.substring(mid2,lastName.length()-1);
        lastName.substring(0,mid2);
        firstName.substring(mid1,firstName.length());
        System.out.println( firstName.substring(0,mid1)+lastName.substring(mid2,lastName.length())+" "+ lastName.substring(0,mid2)+
        firstName.substring(mid1,firstName.length()));


















    }
}
