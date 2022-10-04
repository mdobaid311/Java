package pkgstatic.exercise;

import java.util.Calendar;

class Student{
    private static int count=1;
    Calendar c = Calendar.getInstance();
    String rollNo = "mjcollege-"+c.getWeekYear()+"-"+String.format("%03d", count);
    String name;
    public Student(String name){
        count++;
        this.name =name;
    }
    
    
    public String getDetails(){
        return rollNo+" - "+name;
    }
}


public class StaticExercise {

    public static void main(String[] args) {
        Student s1 = new Student("Obaid");
        Student s2 = new Student("Saif");
        Student s3 = new Student("Koko");
        Student s4 = new Student("nammo");
        Student s5 = new Student("noha");
        Student s6 = new Student("Obaid");
        Student s7 = new Student("Saif");
        Student s8 = new Student("Koko");
        Student s9 = new Student("nammo");
        Student s10 = new Student("noha");

        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
        System.out.println(s3.getDetails());
        System.out.println(s4.getDetails());
        System.out.println(s10.getDetails());
    }
    
}
