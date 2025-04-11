public class Program {
    String code;
    String Name;
    String lecture;


    Program(String pname, String pcode, String plecture){
        Name=pname;
        code=pcode;
        lecture=plecture;

    }
void DisplayProgram(){
        System.out.println("Name:"+Name);
        System.out.println("Program code:"+code);
        System.out.println("Program lecture:"+lecture);
}
}
