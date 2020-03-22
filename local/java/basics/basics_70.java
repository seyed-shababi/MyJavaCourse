package local.java.basics;

public class basics_70{
    public static void main(String[] args){
        System.out.println("String[] args");
        main(new int[2]);
    }
    public static void main(int[] args){
        System.out.println("int[] args");
        /*
        as you see here two main methods with different parameters, which is nothing but overloading,
        which we could say overloading of main method in java is valid but the jvm
        is always looking for main(String[] args) and the other main method we have to call explicitly
        like a normal method as you see here in the code above.
         */
    }
}