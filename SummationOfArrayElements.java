package classExercisesJava;

import java.util.Scanner;

public class SummationOfArrayElements {

    public static void main(String[] args) {
	// Program to add all the numbers in an array
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int alength=sc.nextInt();
        int[] array=new int[alength];
        populateArray(array);
        printArray(array);
    }

    static void populateArray(int[] array){
        for(int i=0;i<array.length;i++)
        {
            array[i]=i+1;
        }
    }
    static void printArray(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("Summation of array numbers is: "+(sum));
    }
}
