package local.java.typeCasting;

public class T_casting_4{
    public static void cast(){
        int a, b, c, d;
        a = b = c = d = 20;
        a += b -= c *= d /= 2;
        System.out.println("a is " + a + " , " + "b is " + b + " , " + "c is " + c + " , " + "d is " + d);

        /*
        as we see here the assignment will happen from right to left
         */
    }
}