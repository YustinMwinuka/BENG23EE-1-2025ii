public class Program {
    String Name;
    String Code;
    String Lecture;
    Program(String pname,String pcode,String plecture){
        Name=pname;
        Code=pcode;
        Lecture=plecture;

    }
    void Displayprogram(){
        System.out.println("Program Name is:  "+Name);
        System.out.println("Program Code is:" +Code);
        System.out.println("Program lecture is:"+Lecture);

    }
}
