package organization;

import java.util.Scanner;

class Student{
    String student_name;
    static int student_id=1;
    int age;
    int marks[] = new int[3];
    Address address;
    
    public Student(String student_name,int age,Address address){
        this.student_name= student_name;
        this.age= age;
        this.address = address;
        student_id++;
    }
    
    public void setMarks(int m1,int m2,int m3){
        marks[0]=m1;
        marks[1]=m2;
        marks[2]=m3;
    }
    
    public void getMarks(){
        System.out.println("Physics marks: "+marks[0]);
        System.out.println("Maths marks: "+marks[1]);
        System.out.println("English marks: "+marks[2]);
    }    
    
    public int getStudentID(){
        return student_id;
    }
}

class Address{
    String street;
    String city;
    
    public Address(String street,String city){
        this.street= street;
        this.city= city;
                
    }
    
    public void getAddress(){
        System.out.printf("Street: %s \ncity %s",street,city);
    }
}

class Lecturer{
    static int lecturer_id=1;
    String name;
    Course course;
    
    public Lecturer(int lecturer_id,String name,Course course){
        this.lecturer_id=lecturer_id;
        this.name=name;
        this.course =course;
    }
}

class Subject{
    static int subject_id=0;
    String subject_name;
    Lecturer lecturer;
    
    public Subject(String subject_name,Lecturer lecturer){
        this.subject_name =subject_name;
        this.lecturer=lecturer;
        subject_id++;
    }
}

class Course{
    static int course_id=1;
    String course_name;
    Student[] students = new Student[10];
    static int count=0;
    Subject[] subjects = new Subject[3];
    
    
    public Course(int course_id,String course_name){
        course_id++;
        this.course_name=course_name;
    }
    
    public void addStudent(Student student){
        if(students.length<10){   
            students[count] = student;
            count++;
            System.out.println("Student enrolled sucessfully");
        }else{
            System.out.println("Maximum students enrolled in the course");
        }
    }
    
    public void removeStudent(int student_id){
        for(int i=0;i<students.length;i++){
            if(students[i].student_id==student_id){
                students[i]=students[students.length-1];
                students[students.length-1]=null;
                System.out.println("Student unenrolled sucessfully");
                return;
            }
        }
        System.out.println("Student not enrolled in the course");
    }
    
    public void setSubjects(Subject s1,Subject s2,Subject s3){
        subjects[0]=s1;
        subjects[1]=s2;
        subjects[2]=s3;
    }
}

class College{
    String college_name;
    Course[] courses= new Course[3];
    Student[] students = new Student[100];
    static int count=0;
    
    public College(String college_name){
        this.college_name=college_name;
    }
    
    public void setCourses(Course c1,Course c2,Course c3){
        courses[0]=c1;
        courses[1]=c2;
        courses[2]=c3;
    }
    
    public void getCourses(){
        System.out.printf("The courses offered are: %s %s %s",courses[0],courses[1],courses[2]);
    }
    
    public void admitStudent(String student_name,int age,Address address){
        Student student = new Student(student_name,age,address);
        students[count++]=student;
        System.out.println("Student admitted sucessfully");
    }
    
    public Student getStudent(int student_id){
        for (Student student : students) {
            if (student.student_id == student_id) {
                return student;
            }
        }
     return null;
    }
}


public class Organization {

    public static void main(String[] args) {
        
        while(true){
            System.out.println("Select option: ");
            System.out.println("1.Student operations\n2.Course operations\n3.Lecturer Operations");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            College college = new College("MJCET");
            
            switch(choice){
                case 1 -> {
                    System.out.println("Select option: ");
                    System.out.println("1. Add student\n2. Remove Student\n3.Get student marks");
                    int studentChoice = sc.nextInt();
                    switch(studentChoice){
                        case 1 -> {
                            System.out.println("Enter student name: ");
                            String name =sc.nextLine();
                            System.out.println("Enter student age: ");
                            int age =sc.nextInt();
                            System.out.println("Enter student city: ");
                            String city =sc.nextLine();
                            System.out.println("Enter student street: ");
                            String street =sc.nextLine();
                            Address address = new Address(street, city);
                            college.admitStudent(name, age, address);
                        }
                    }
                }

            }
        }
        
    }
    
    public void addStudent(){
        
    }
    
}
