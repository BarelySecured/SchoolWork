//Class: CSE 1321L
//Section: J02
//Term: Spring 2022
//Instructor: Gopi Macha
//Name: Nathan Ly
//Lab: Assignment3    

    
import java.util.Scanner;
class Assignment3C{
    public static void main(String args[]){
        Scanner cn = new Scanner(System.in);
        System.out.println("[App Checklist]");
        System.out.print("What mobile device do you have? ");
        String devi = cn.nextLine();

        if ( devi.equals("Android") || devi.equals("Apple")){
            if (devi.equals("Android")){
                System.out.print("What version do you have? ");
                float ver = cn.nextFloat();
                cn.nextLine();
                if (ver >= 10) {
                    System.out.println("Congratulations, you can run the app!");
                }
                else {
                    System.out.print("Does your device support Bluetooth connection? ");
                    String ans = cn.nextLine();
                    if (ans.equals("Yes")){
                        System.out.println("Congratulations, you can run the app!");
                    }
                    else {
                        System.out.println("I'm sorry, our app does not support your device.");
                    }
                }
            }
            else {
                System.out.print("What version do you have? ");
                float ver = cn.nextFloat();
                cn.nextLine();
                if (ver >= 12) {
                    System.out.println("Congratulations, you can run the app!");
                }
                else {
                    System.out.print("Does your device support NFC? ");
                    String ans = cn.nextLine();
                    if (ans.equals("Yes")){
                        System.out.println("Congratulations, you can run the app!");
                    }
                    else {
                        System.out.println("I'm sorry, our app does not support your device.");
                    }
                }
            }


        }
        else System.out.println("I'm sorry.");
    }
}