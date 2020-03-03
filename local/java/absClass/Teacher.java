package local.java.absClass;
import local.java.absClass.Person;

class Teacher extends Person{
    String book;
    Teacher(String name, int age, int rol, String book){
        super(name, age, rol);
        this.book = book;
    }
}


