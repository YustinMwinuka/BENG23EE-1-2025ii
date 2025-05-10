public class Program {
    String Name;
    String Code;
    String Lecture;

    Program(String pName, String pCode, String pLecture){
        Name=pName;
        Code=pCode;
        Lecture=pLecture;
    }
    void DisplayProgram(){
        System.out.println("Program name: "+Name);
        System.out.println("Program code: "+Code);
        System.out.println("Program lecture: "+Lecture);
    }
}
