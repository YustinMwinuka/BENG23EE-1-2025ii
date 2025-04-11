public class Program {
    String Name;
    String Code;
    String Lecture;
    Program(String sName, String sCode, String sLecture) {
        this.Name = sName;
        this.Code = sCode;
        this.Lecture = sLecture;
    }
    void displayProgram() {
        System.out.println("The program name is: " + Name);
        System.out.println("The module code is: " + Code);
        System.out.println("The lecturer is: " + Lecture);
    }
}
