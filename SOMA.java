import java.util.Scanner;

public class SOMA {
    public static void main(String[] args) {
        String nName;
        nName = "Machine learning";
        Program P = new Program("Electrical ", "CSEE0876", "Mwajuma");
        Student S=new Student("sifa","2303437859","female");
        Student S1=new Student("clara","2303437988","female");
        Student S2=new Student("juma","2303789900","male");
        Student S3=new Student("Alex","2303456780","male");
        System.out.println("Program");
        P.Displayprogram();
        System.out.println("Student");
        S.DisplayStudent();
        System.out.println("Student 1");
        S1.DisplayStudent();
        System.out.println("Student 2");
        S2.DisplayStudent();
        System.out.println("Student 3");
        S3.DisplayStudent();
        Scanner scanner=new Scanner(System.in);
        System.out.println("\nEnter the student Name to check their RegNo");
        String inputname = scanner.nextLine().trim().toLowerCase();

        if (inputname.equals(S.Name.toLowerCase())){
            System.out.println("RegNo for" +S.Name +";"+S.RegNo);
        }
        else if (inputname.equals(S2.Name.toLowerCase())){
            System.out.println("RegNo for" +S2.Name +";"+S.RegNo);
        }
        else{
            System.out.println("Student not found");
        }



    }
}