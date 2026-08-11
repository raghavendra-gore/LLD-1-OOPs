package IntroToOOps;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("ABC", "abc@gmail.com", "XYZ", 20);
        System.out.println(s);

//        s.name = "ABC";
//        s.email = "abc@gmail.com";
//        s.universityName = "XYZ";
//        s.age = 20;

        System.out.println(s.name);
        System.out.println(s.email);
        System.out.println(s.universityName);
        System.out.println(s.age);
    }
}
