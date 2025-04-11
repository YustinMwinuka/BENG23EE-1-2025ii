public class program {
    String Name;
    int code;
    int Credit;



    program(String pname, int pcode, int pcredit){
        Name=pname;
        code=pcode;
        Credit=pcredit;
    }



    void DisplayProgram(){
        System.out.println("Name:"+Name);
        System.out.println("Subject code:"+code);
        System.out.println("Subject Credit:"+Credit);
    }
}
