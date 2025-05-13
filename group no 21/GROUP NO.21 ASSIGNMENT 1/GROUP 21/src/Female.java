import java.util.Scanner;

class Female{
    String Name;
    String Voice;
    String Gender;
    void Displayfemale() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        Name = sc.nextLine();
        System.out.println("Enter your voice");
        Voice = sc.nextLine();
        System.out.println("Enter your Gender");
        Gender = sc.nextLine();
        System.out.println("Name:"+Name);
        System.out.println("Voice:"+ Voice);
        System.out.println("Gender:" + Gender);
    }


}



