import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args ){
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to Your Very Own Email Generator!");
        System.out.print("Full name(First Last): ");
        String fullName= scan.nextLine();
        System.out.print("Email provider(gmail.com, etc): ");
        String email= scan.nextLine();

             String makeUserName = fullName.toLowerCase();
            makeUserName.substring(0, 1);
            int last= fullName.indexOf(" ");
            String username=makeUserName.substring(0, 1)+makeUserName.substring(last+1,fullName.length())+(int)(Math.random()*100+10);

            String makeEmail=username+email;
        System.out.println("Your generated email address is: "+ makeEmail);

        }
    }

