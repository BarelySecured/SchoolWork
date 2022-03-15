//Class: CSE 1321L
//Section: J02
//Term: Spring 2022
//Instructor: Gopi Macha
//Name: Nathan Ly
//Lab: Assignment3

import java.util.Scanner;
class Assignment3B{
    public static void main(String args[]){
        Scanner cn = new Scanner(System.in);
        System.out.println("[Instructor Scheduler]");
        System.out.print("What day of the week is it? ");
        char day = cn.next().charAt(0);
        System.out.print("What time of day? ");
        char time = cn.next().charAt(0);

        switch (day){
            case 'M':{
                switch (time){
                    case 'a':{
                        System.out.println("On Monday Morning, you'll be teaching C++, section E04!");
                        break;
                    }
                    case 'p':{
                        System.out.println("On Monday Afternoon, you'll be teaching Java, section J02!");
                        break;
                    }
                    default:
                        System.out.println("That's not a valid day or time!!");
                        break;

                }
                break;
            }
            case 'T':{
                switch (time){
                    case 'a':{
                        System.out.println("On Tuesday Morning, you'll be holding office hours!");
                        break;
                    }
                    case 'p':{
                        System.out.println("On Tuesday Afternoon, you'll be teaching C#, section W#1!");
                        break;
                    }
                    default:
                        System.out.println("That's not a valid day or time!!");
                        break;

                }
                break;
            }
            case 'W':{
                switch (time){
                    case 'a':{
                        System.out.println("On Wednesday Morning, you'll be teaching C#, section #02!");
                        break;
                    }
                    case 'p':{
                        System.out.println("On Wednesday Afternoon, you'll have some free time!");
                        break;
                    }
                    default:{
                        System.out.println("That's not a valid day or time!!");
                        break;
                    }
                }
                break;
            }
            case 'R':{
                switch (time){
                    case 'a':{
                        System.out.println("On Thursday Morning, you'll holding office hours");
                        break;
                    }
                    case 'p':{
                        System.out.println("On Thursday Afternoon, you'll be teaching C++, section WE3!");
                        break;
                    }
                    default:{
                        System.out.println("That's not a valid day or time!!");
                        break;
                    }

                }
                break;
            }
            case 'F':{
                switch (time){
                    case 'a':{
                        System.out.println("On Friday Morning, you'll be teaching Java, section WJ3!");
                        break;
                    }
                    case 'p':{
                        System.out.println("On Monday Afternoon, you'll have some free time!");
                        break;
                    }
                    default:{
                        System.out.println("That's not a valid day or time!!");
                        break;
                    }

                }
                break;
            }
            default: {
                System.out.println("That's not a valid day or time!!");
                break;
            }

        }
    }
}