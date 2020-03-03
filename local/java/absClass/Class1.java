package local.java.absClass;
import local.java.absClass.Student;
import local.java.absClass.Teacher;

public class Class1 {
    public static void main(String[] args) {
        Student s1 = new Student("Faced", 40, 100, 1);
        Student s2 = new Student("Sheila", 36, 101, 2);
        Student s3 = new Student("Senor", 34, 102, 3);
        Student s4 = new Student("Ara", 28, 103, 4);
        Teacher t1 = new Teacher("Sheela", 39, 103, "Math");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rol);
        System.out.println(s1.level);
        System.out.println(t1.book);
    }
}


