package classExercisesJava;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
	/* Program to print the day of week based on the
	day of the month...*/
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a month number");
        int dom=Integer.parseInt(sc.nextLine());
        if (!(dom==0) && !((dom)>31)){
            if (dom > 7) {
                int dow = dom % 7;
                switch (dow){
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 0:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Incorrect day number:"+dom);
                }
            }
        }
        else {
            System.out.println("Incorrect day number:"+dom);
        }

    }
}
