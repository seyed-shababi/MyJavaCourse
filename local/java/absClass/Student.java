package local.java.absClass;
import local.java.absClass.Person;

class Student extends Person{
    int level;
    Student(String name, int age, int rol, int level){
        super(name, age, rol);
        this.level = level;
    }
}

