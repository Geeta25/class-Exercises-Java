package classExercisesJava;

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        //Program to find Students result
        Scanner sc = new Scanner(System.in);
        System.out.println("Student details: ");
        String name=sc.nextLine();
        int rollnum=sc.nextInt();
        int marks=sc.nextInt();

        Student st=new Student(name,rollnum,marks);

        String flag=st.compareMarks();
        if (flag.equals("Pass")) {
            st.printResultPass();
        }
        else {
            st.printResultFail();
        }
    }
}
