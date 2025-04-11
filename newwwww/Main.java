import java.util.Scanner;
class human {
    public static void main(String[] args) {
        int choice;
        Female ofemale = new Female();
        Male omale = new Male();
        Scanner sc = new Scanner(System.in);
        System.out.println("Make choice for display feature");
        System.out.println("choice 1: Male");
        System.out.println("choice 2: Female");
        System.out.println("Enter your choice(1|2)");
        choice =sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n---Male details---");
                omale . DisplayMale();
                break;
            case 2:

                System.out.println("\n---Female details------");
                ofemale . DisplayFemale();
                break;
            default:
                System.out.println("Invalid choice.");

        }

    }

}










