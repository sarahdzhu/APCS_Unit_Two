import java.util.Scanner;


public class Password {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print ("First name: ");
    String firstName= scan.nextLine();
    System.out.print("Middle name: " );
    String middleName = scan.nextLine();
    System.out.print("Last name: ");
    String lastName = scan.nextLine();
    System.out.print("Age: ");
    int age= scan.nextInt();

    int mid1= firstName.length()/2;
    int mid2= middleName.length()/2;
    int mid3= lastName.length()/2;

   char midL= firstName.toUpperCase().charAt(mid1);
    middleName.toUpperCase().charAt(mid2);
    lastName.toUpperCase().charAt(mid3);


    char lastL= lastName.charAt(lastName.length()-1);
    middleName.charAt(middleName.length()-1); firstName.charAt(firstName.length()-1); lastName.charAt(lastName.length()-1);


        System.out.println("        ");
        System.out.println("Password: "+firstName.toUpperCase().charAt(mid1)+
        middleName.toUpperCase().charAt(mid2)+
        lastName.toUpperCase().charAt(mid3) +lastName.charAt(lastName.length()-1)+
        middleName.charAt(middleName.length()-1)+ firstName.charAt(firstName.length()-1)+age*75);









    }}
