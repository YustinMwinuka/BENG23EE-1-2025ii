import java.util.Scanner;

class Human {
    public static void main(String[] args) {
        Female ofemale = new Female();
        Male omale = new Male();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Make a Choice\n------------");
        System.out.println("Option 1: Male");
        System.out.println("Option 2: Female");
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You Have choosen the class Male");
                omale.DisplayMale();
                break;
            case 2:
                System.out.println("You Have choosen the class Female");
                ofemale.Displayfemale();
                break;
        }
    }
}




