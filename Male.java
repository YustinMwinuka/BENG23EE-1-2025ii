import java.util.Scanner;

public class Male {
    String Name;
    String Gender;
    String Voice;
    Scanner sc = new Scanner(System.in);
    void DisplayMale(){
        System.out.println("Enter your name");
        Name = sc.nextLine();
        System.out.println("Enter your voice");
        Voice = sc.nextLine();
        System.out.println("Enter your Gender");
        Gender= sc.nextLine();

        System.out.println("This are male properties");
        System.out.println("Name:"+Name);
        System.out.println("Gender:"+Gender);
        System.out.println("Voice:"+Voice);



    }
}
