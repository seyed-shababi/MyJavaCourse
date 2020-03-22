package local.java.basics;

public class basics_71{
    public static void main(String[] args){
        System.out.println("I am from parent main method!");
    }
}
class child_1 extends basics_71{

}
/*
as you see here the basics_71 is parent class and child is child class,
even child does not have main method but when we run child or basics_71 the output is "I am from parent main method!",
hence we could say that the inheritance concept is applicable for main method

 */
