import javax.naming.Name;
import java.util.Scanner;

public class SOMA {
    public static void main(String[]args){
        String Name;
        Program P1= new Program("OOP","767","Mwinuka");
        Student S1=new Student("Siriely", "Electrical","female");
        Student S2=new Student("James","Marketing","male");
        System.out.println("student info");
        S1.DisplayStudent();
        System.out.println("  ");
        S2.DisplayStudent();
        System.out.println("subject info");
        P1.DisplayProgram();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        Name=sc.nextLine();
        if (Name.equalsIgnoreCase(S1.Name)){
            System.out.println("Machine language");

        }
    else if(Name.equalsIgnoreCase(S2.Name)) {
        System.out.println("BENG23EE");
        }
    else{
        System.out.println("none of the option");
        }
    }

}
