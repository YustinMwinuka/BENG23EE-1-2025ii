import java.util.Scanner;

class Male {
     String Name;
     String Voice;
     String Gender;
     Scanner sc= new Scanner(System.in);
     void DisplayMale() {
         System.out.println("Enter your name");
         Name=sc.nextLine();
         System.out.println("Enter your type of voice");
         Voice=sc.nextLine();
         System.out.println("Enter your Gender");
         Gender=sc.nextLine();
         System.out.println("Name: " + Name);
         System.out.println("Gender:" + Gender);
         System.out.println("Voice:"  + Voice);

     }
 }