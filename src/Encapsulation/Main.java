package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(001);
        s.setName("Todd Hopkins");
        s.setEmail("Thop@gmail.org");
        s.setPhone(1234567890);

        Student r = new Student();
        r.setId(002);
        r.setName("Mario Wells");
        r.setEmail("Wario@gmail.com");
        r.setPhone(1234567898);

        System.out.println("Student ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Email: " + s.getEmail());
        System.out.println("Phone: " + s.getPhone());

        System.out.println("Student ID: " + r.getId());
        System.out.println("Name: " + r.getName());
        System.out.println("Email: " + r.getEmail());
        System.out.println("Phone: " + r.getPhone());
    }
}
