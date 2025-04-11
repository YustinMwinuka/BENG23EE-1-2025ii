import java.util.Scanner;

public class Female {
   static String Name;
    static String Gender;
    static String Voice;

    Scanner sc = new Scanner(System.in);
    void DisplayFemale() {
        System.out.println("Enter your name");
        Name=sc.nextLine();
        System.out.println("Enter your gender");
        Gender=sc.nextLine();
        System.out.println("Enter your voice");
        Voice=sc.nextLine();
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
        System.out.println("Voice: " + Voice);
    }
}
