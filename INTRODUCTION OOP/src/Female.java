import java.util.Scanner;
public class Female {
    String Name;
    String Voice;
    String Gender;
    void displayfemale() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the Female");
        Name=sc.nextLine();
        System.out.println("Enter the voice of the Female");
        Voice=sc.nextLine();
        System.out.println("Enter the gender of the Female");
        Gender=sc.nextLine();
        System.out.println("Name:" + Name);
        System.out.println("Voice:" + Voice);
        System.out.println("Gender:" + Gender);
    }

}
