import java.util.Scanner;
public class Human {
    public static void main(String[] args) {
        Female F = new Female();
        Male M = new Male();
        System.out.println("Welcome make a choice\n------------");
        System.out.println("option 1:Male");
        System.out.println("option2:Female");
        int choice;
        Scanner SC = new Scanner(System.in);
        System.out.println("enter your choice");
        choice = SC.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have chosen the class male");
                M.displayMale();
                break;

            case 2:

                System.out.println("You have chosen the class female");
                F.displayfemale();
                break;

        }
    }
}

