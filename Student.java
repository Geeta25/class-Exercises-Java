package classExercisesJava;

public class Student {
    //Student information for students result
    String name;
    int rollnum;
    int marks;
    String flag;

    Student(String name,int rollnum, int marks){
        this.rollnum=rollnum;
        this.marks=marks;
        this.name=name;
    }

    String compareMarks(){
        if (marks>35){
            flag="Pass";
        }
        else
        {
            flag="Fail";
        }
        return flag;
    }

    void printResultPass(){
        System.out.println("Student's result is: "+flag);
        System.out.println("Student details: "+name+","+rollnum+","+marks);
    }

    void printResultFail(){
        System.out.println("Student's result is: "+flag);
        System.out.println("Student details: "+name+","+rollnum+","+marks);
        System.out.println("Marks needed to pass: "+(35-marks));
    }
}
