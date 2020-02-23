package local.java.sourceFile;

class A{
    public static void main(String[] args){
        System.out.println("A class");
    }
}
class B{
    public static void main(String[] args){
        System.out.println("B class");
    }
}
class C{
    public static void main(String[] args){
        System.out.println("C class");
    }
}
class D{

}

/*    - if there is no public class in the java program then the java program can be any name
      - if there is no public class in the java program you can use as many as main classes you want
      and run the class in command line by using java A or java or java C
      - we compile the java program by using the name of the program like sourceFile.java
      - we run the java program by using the name of the class and not the program self like java C or java A or
      java B ou java D
      - by compiling the java program the compiler creates for all the classes in the program a class file with their
      correspond name
      - we can run the classes above in java 1.5v
      -whenever we are executing a java class the corresponding class main method will be executed, if the class does
      not contain main method then we will get run time exception RE: NoSuchMethod; main
      - if the corresponding that class file not available then we will ger RE:  NoClassDefFoundError

*/