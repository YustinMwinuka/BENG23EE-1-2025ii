import java.util.Scanner;
public class SOMA {
    public static void main (String[]args){
        String Name;
        Program p = new Program( "OOP",  "Deodatus","CSE 07205");
        Student s1= new Student("kharath","BENG2EE","Female");
        Student s2= new Student("Khafidh","BENG23ETE","Male");
        System.out.println("Student info");
        s1.DisplayStudent();
        System.out.println(" ");
        s2.DisplayStudent();
        System.out.println("Subject info");
        p.DisplayProgram();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        Name=sc.nextLine();
        if(Name.equalsIgnoreCase(s1.Name)){
            System.out.println("Machine language");
        }
        else if (Name.equalsIgnoreCase(s2.Name)){
            System.out.println("BENG23ETE");

        }
        else{
            System.out.println("none of the option");
        }
    }
}
