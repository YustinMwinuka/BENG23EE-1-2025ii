public class Program {
    String Name;
    String Code;
    String Lecture;

    Program(String Name, String Code, String Lecture) {
        this.Name = Name;
        this.Code = Code;
        this.Lecture = Lecture;
    }

    void displayProgram() {
        System.out.println("Program Name:" + Name);
        System.out.println("Program Code:" + Code);
        System.out.println("Program Lecture:" + Lecture);
    }
}
