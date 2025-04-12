//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
s

        System.out.println("Welcome to the new Program, please make choice between 1 and 2 \n");

        //creating the objects for male and female class

        Male male = new Male();
        Female female = new Female();

        int choice = scan.nextInt();

        switch(choice){
            case 1:
                System.out.println("ENTER THE BELOW MALE INFORMATION.......!");

                male.name=scan.nextLine();
                System.out.println("Enter name\n");
                male.name=scan.nextLine();
                System.out.println("Enter gender\n");
                male.gender=scan.nextLine();
                System.out.print("Enter voice\n");
                male.voice=scan.nextLine();

                System.out.println("**************");

                System.out.println("Welcome " + " " + male.name + "the below are your properties");
                System.out.println("name:" + male.name);
                System.out.println("gender: " + male.gender);
                System.out.println("voice: " + male.voice);

                System.out.println("*****************END**********************");

                break;
            case 2:

                System.out.println("ENTER THE BELOW FEMALE INFORMATION.......!");
                female.name=scan.nextLine();
                System.out.println("Enter name");
                female.name=scan.nextLine();
                System.out.println("Enter gender");
                female.gender=scan.nextLine();
                System.out.print("Enter voice");
                female.voice=scan.nextLine();

                System.out.println("**************");

                System.out.println("Welcome " + " " + female.name + "the below are your properties");
                System.out.println("name:" + female.name);
                System.out.println("gender: " + female.gender);
                System.out.println("voice: " + female.voice);

                System.out.println("*****************END**********************");


                break;
            default:
                System.out.println("Invalid choice, choice is between 1 and 2 only");
                break;
        }


    }
}