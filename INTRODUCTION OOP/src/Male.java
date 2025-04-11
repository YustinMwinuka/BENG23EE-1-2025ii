import java.util.Scanner;

class Male {
   static String Name;
   static String Voice;
   static String Gender;

    void displayMale() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the Male");
        Name=sc.nextLine();
        System.out.println("Enter the voice of the Male");
        Voice=sc.nextLine();
        System.out.println("Enter the gender of the Male");
        Gender=sc.nextLine();
        System.out.println("Name:" + Name);
        System.out.println("Voice:" + Voice);
        System.out.println("Gender:" + Gender);

    }
}
