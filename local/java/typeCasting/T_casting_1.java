package local.java.typeCasting;

public class T_casting_1{
    public static void cast(){
        int x = 'a';  // implicit type casting, internaly char type converts to int
        System.out.println(x);
        double d = 10; // implicit type casting, internally 10(int) converts to double, (int type is smaller then double type)
        System.out.println(d);
    }
}