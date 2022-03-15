//Class: CSE 1321L
//Section: J02
//Term: Spring 2022
//Instructor: Gopi Macha
//Name: Nathan Ly
//Lab: Assignment3

import java.util.Scanner;
class Assignment3A{
    public static void main(String args[]){
        Scanner cn = new Scanner(System.in);
        System.out.println("[Scrappy's Bucket List Rewards]");
        System.out.print("How many events have you attend? ");
        float num = cn.nextInt();
        cn.nextLine();
        float per = num / 63 * 100;
        if ( per >= 10 ) {
            System.out.println("You have been to "+(int)(per)+"% of all SBL events!");
            System.out.println("You've earned a Drawstring Bag!");
            if (per >= 25){
                System.out.println("You've earned a Hat!");
                if (per >= 50){
                    System.out.println("You've earned a T-Shirt!");
                    if (per >= 75){
                        System.out.println("You've earned a Glass Water Bottle!");
                        if (per == 100){
                            System.out.println("You've earned a Hoodie!");
                            System.out.print("Are you graduating? ");
                            String ans = cn.nextLine();
                            System.out.println("There's a special reward when you graduate!");
                        }
                    }   
                }
            }
        }
        else {
            System.out.println("Check out events at https://studentaffairs.kennesaw.edu/scappysbucketlist/!");
        }
    }
}