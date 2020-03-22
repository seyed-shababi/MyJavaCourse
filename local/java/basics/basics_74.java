package local.java.basics;

public class basics_74{

    static{
        System.out.println("I am the static method");
    }
    public static void main(String[] args){
        System.out.println("I am the from main method");
    }
}
        /*
        as you see here from 1.7 version of java in time run time jvm first
        check if the class contains main method or not,
        if the main method is there then jvm starts to run the code and
        the order will not change, like you see here the static method
        will execute first then main method.
        very important to look video 14.
        */