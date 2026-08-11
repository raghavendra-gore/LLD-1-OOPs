package IntroToOOps;

public class Student {
     String name;
     String email;
     String universityName;
     int age;

//    public Student(String newName, String newEmail, String newUniversityName, int newAge){
//        name = newName;
//        email = newEmail;
//        universityName = newUniversityName;
//        age = newAge;
//    }

    public Student(String name, String email, String universityName, int age){
        this.name = name;
        this.email = email;
        this.universityName = universityName;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("I am student");
    }
}
