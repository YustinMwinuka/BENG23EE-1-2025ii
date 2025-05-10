
import java.util.Scanner;
class Main{

    public static void main(String[]args) {
        Female ofemale = new Female();
        Male omale = new Male();
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome make a choice\n");
        System.out.println("Option 1:Female");
        System.out.println("Option 2:Male");

        System.out.println("ENTER YOUR OPTION");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have select class Male");
                omale.DisplayMale();
                break;

            case 2:
            System.out.println("  You have select class Female");
            ofemale.DisplayFemale();
            break;

            default:
                System.out.println("enter the choice again");
        }


    }

}