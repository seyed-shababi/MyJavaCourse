package local.java.basics;

public class basics_63{
    int[] x = new int[3];
    public static void main(String[] args){
        basics_63 b1 = new basics_63();
        System.out.println(b1.x);
        System.out.println(b1.x[0]);
        System.out.println(b1.x[1]);
        System.out.println(b1.x[2]);
        /*
        as you see here if we declare and initialize the instance array the
        default value of 0 will be provided to the elements
         */
    }
}