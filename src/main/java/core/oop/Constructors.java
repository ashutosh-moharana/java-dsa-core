package core.oop;

public class Constructors {
    public static void main(String[] args) {
        Student s = new Student("Ashutosh");
        System.out.println(s);
        //Output: Student{name='Ashutosh', age=0, rollNo=0, college='unknown'}
    }
}

class Student{
    String name; //information/data/characteristics ---> Instance variables
    int age;
    int rollNo;
    String college;

    //Type 2 Constructor Chaining
    Student(){
        this("unknown");
    }
    Student(String name){
        this(name,0);
    }
    Student(String name, int age){
        this(name, age, 0);
    }
    Student(String name, int age,int rollNo){
        this(name,age,rollNo,"unknown");
    }
    Student(String name, int age,int rollNo,String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                ", college='" + college + '\'' +
                '}';
    }
}

/*
  ## Constructor Chaining.
  Type 1.
    Student(){
        this("unknown",0,0,"unknown");
    }
    Student(String name){
        this(name,0,0,"unknown");
    }
    Student(String name, int age){
        this(name, age, 0, "unknown");
    }
    Student(String name, int age,int rollNo){
        this(name,age,rollNo,"unknown");
    }
    Student(String name, int age,int rollNo,String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;

    }
 */
