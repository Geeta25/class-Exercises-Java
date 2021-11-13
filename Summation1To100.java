package classExercisesJava;

public class Summation1To100 {

    public static void main(String[] args) {
	// Summation of numbers from 1-100
        int sum=0;
        for(int i=1;i<=100;i++)
        {
            sum=sum+i;
        }
        System.out.println("Summation of numbers is:"+(sum));
    }
}
