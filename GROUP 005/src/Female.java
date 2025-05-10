import java.util.Scanner;

class Female {
    static String Name;
    static String Voice;
    static String Gender;
    Scanner sc = new Scanner(System.in);

    void DisplayFemale(){
        System.out.println("THESE ARE FEMALE PROPERTIES");
        System.out.println("ENTER YOUR NAME");
        Name=sc.nextLine();
        System.out.println("ENTER YOUR GENDER");
        Gender=sc.nextLine();
        System.out.println("ENTER YOUR VOICE");
        Voice=sc. nextLine();
        System.out.println("Name:"   +Name);
        System.out.println("Voice;"   +Voice);
        System.out.println("Gender:"   +Gender);
    }
}
