public class Program {
    String Name;
    String Lecture;
    String Code;
    Program(String pname,String plecture,String pcode) {
        Name = pname;
        Code = pcode;
        Lecture = plecture;
    }
    void DisplayProgram(){
        System.out.println("Program name"  + Name);
        System.out.println("Program code" + Code);
        System.out.println("Program lecture" + Lecture);





    }
}
