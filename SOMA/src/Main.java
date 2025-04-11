 import java.util.Scanner;
class SOMA{
    public static void main(String[]args){
          String Name;
       program p=new program("OOP",45690,12);
       student s1=new student( "JUSTICE",343401743,2);
       student s2=new student("ZAINA",343402213,2);
       System.out.println("Student info");
       s1.DisplayStudent();
       System.out.println(" ");
       s2.DisplayStudent();
       System.out.println("Subject info");
        System.out.println(" ");
        p.DisplayProgram();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the name");
       Name=sc.nextLine();
       if(Name.equalsIgnoreCase(s1.Name)){
            System.out.println("Machine language");
       }
       else if (Name.equalsIgnoreCase(s2.Name) ) {
            System.out.println("BENGCOE");

       }
       else{
            System.out.println("none of the option");

       }
     }
}