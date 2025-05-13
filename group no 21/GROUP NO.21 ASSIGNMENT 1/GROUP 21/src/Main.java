import java.util.Scanner;

class Human{
    static String Name;
    static String Gender;
    static String Voice;


    public static void main(String[] args){
        Male omale=new Male();
        Female ofemale=new Female();
        int choice;
       Scanner sc = new Scanner(System.in);



       System.out.println("Welcome Make a choice \n 1:Male \n 2:Female");
       System.out.println("Enter your choice");
       choice=sc.nextInt();
       switch(choice){
           case 1:System.out.println("You have choosen the class Female ");
               omale.Displaymale();
           break;
               case 2:ofemale.Displayfemale();
               break;
           }
       }

    }
