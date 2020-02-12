public class basics_72{
    public static void main(String[] args){
        System.out.println("I am from parent main method!");
    }
}
class child_2 extends basics_72{
    public static void main(String[] args){
        System.out.println("I am from child_2 main method!");
    }
}
        /*
        as you see here in the code above the class child_2.java is a child of basics_72.java
        but when we run the class of basics_72 its main method will be executed and when we run the child_2.java
        its own main method is executed because it has already main method and not need to execute the main of parent.
        - here in this code the parent and child class have the main method with the same arguments ===>> seems to be
        an over ridding for main but it is not and it is method hiding which we will discuss it in oops concept.
         */