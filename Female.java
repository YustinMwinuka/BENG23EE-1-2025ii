import java.util.Scanner;

public class Female{
    String Name;
    String Voice;
    String Gender;
    Scanner sc = new Scanner(System.in);
    void Displayfemale() {
        System.out.println("Enter your name");
        Name = sc.nextLine();
        System.out.println("Enter your voice");
        Voice = sc.nextLine();
        System.out.println("Enter your Gender");
        Gender= sc.nextLine();

        System.out.println("This are female properties");
        System.out.println("Name:"+Name);
        System.out.println("Gender:"+Gender);
        System.out.println("Voice:"+Voice);
    }
}