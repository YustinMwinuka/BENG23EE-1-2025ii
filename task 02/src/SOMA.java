import java.util.Scanner;

public class SOMA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Program progJusto = new Program("CSET 0783", "Melinuka", "Machine Learning");
        Program progZaina = new Program("BENG 2311", "Mwalimu Elia", "BENG23EE");

        Student justo = new Student("JUSTO", "Male", progJusto);
        Student zaina = new Student("ZAINA", "Female", progZaina);

        System.out.print("Enter student name (JUSTO or ZAINA): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("JUSTO")) {
            justo.displaySubjectOnly();
        } else if (choice.equalsIgnoreCase("ZAINA")) {
            zaina.displaySubjectOnly();
        } else {
            System.out.println("Invalid input. Please enter 'JUSTO' or 'ZAINA'.");
        }

        input.close();
    }
}