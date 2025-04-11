public class Student {

    String Name;
    String Gender;
    int Regno;

Student(String sName, String sGender, int sRegno) {
    Name = sName;
    Gender = sGender;
    Regno = sRegno;
}
void DisplayStudent(){
System.out.println("Name;"+ Name);
System.out.println("Gender;"+ Gender);
System.out.println("Regno;"+ Regno);
}

}
