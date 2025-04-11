import java.util.Scanner;
class Male {
    String Name;
    String Gender;
    String Voice;
    void DisplayMale() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        Name = sc.nextLine();
        System.out.println("enter your gender");
        Gender = sc.nextLine();
        System.out.println("enter your voice");
        Voice = sc.nextLine();
        System.out.println("Name:" + Name);
        System.out.println("Gender:" + Gender);
        System.out.println("Voice:" + Voice);
    }
}
class Female{
    String Name;
    String Gender;
    String Voice;

    void DisplayFemale() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        Name = sc.nextLine();
        System.out.println("enter your gender");
        Gender = sc.nextLine();
        System.out.println("enter your voice");
        Voice = sc.nextLine();
        System.out.println("Name:" + Name);
        System.out.println("Gender:" + Gender);
        System.out.println("Voice:" + Voice);
    }
}
class Human {
    String KingdomName;
    String Breath;
    String Hunger;

    public static void main(String[] args) {
        Female ofemale = new Female();
        Male omale = new Male();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("WELLCOME TO JAVA GENDER CHOICES");
        System.out.println("Enter 1 for male choice");
        System.out.println("Enter 2 for female choice");
        choice = sc.nextInt();
        switch (choice) {
                    case 1:
                        System.out.println("Enter name for male: ");
                        omale.DisplayMale();
                        break;
                    case 2:
                        System.out.println("Enter name for female: ");
                        ofemale.DisplayFemale();
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose either 1 or 2 ");
                        sc.close();
        }
    }
}