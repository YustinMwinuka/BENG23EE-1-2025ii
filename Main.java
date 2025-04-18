import java.util.Scanner;

class Human {
    String KingdomName;
    String Breath;
    String Hunger;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Female oFemale = new Female();
        Male oMale = new Male();
        Human oHuman = new Human();

        System.out.println("WELCOME TO MAKE A CHOICE \n");
        System.out.println(" Option 1: Male");
        System.out.println(" Option 2: Female");

        int Choice = sc.nextInt();
        sc.nextLine();

        switch (Choice) {
            case 1:
                System.out.println("YOU HAVE CHOSEN THE MALE CLASS");

                System.out.print("Enter Name: ");
                oMale.Name = sc.nextLine();

                System.out.print("Enter Gender: ");
                oMale.Gender = sc.nextLine();

                System.out.print("Enter Voice: ");
                oMale.Voice = sc.nextLine();

                oMale.DisplayMale();
                break;

            case 2:
                System.out.println("YOU HAVE CHOSEN THE FEMALE CLASS");

                System.out.print("Enter Name: ");
                oFemale.Name = sc.nextLine();

                System.out.print("Enter Gender: ");
                oFemale.Gender = sc.nextLine();

                System.out.print("Enter Voice: ");
                oFemale.Voice = sc.nextLine();

                oFemale.DisplayFemale();
                break;

            default:
                System.out.println("Invalid Option");
        }

        sc.close();
    }
}