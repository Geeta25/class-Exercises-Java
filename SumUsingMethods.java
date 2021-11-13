package classExercisesJava;

import java.util.Scanner;

public class SumUsingMethods {

    public static void main(String[] args) {
	// Addition using methods(in the same class)
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("enter num3");
        int num3=sc.nextInt();

        int sum2=addnums(num1,num2);
        System.out.println("Summation is"+sum2);
        int sum3=addnums(num1,num2,num3);
        System.out.println("Summation is"+sum3);
    }
    static int addnums(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    static int addnums(int num1, int num2, int num3){
        int sum=num1+num2+num3;
        return sum;
    }
}
