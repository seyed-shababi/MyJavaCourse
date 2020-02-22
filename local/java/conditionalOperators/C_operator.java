package local.java.conditionalOperators;

public class C_operator{
    public static void cond(){
        int x = (10 < 30) ? 50 : 7;
        System.out.println(x);
        int y = ( 10 < 30) ? 20 : ((10 > 50) ? 60 : 100);
        System.out.println(y);

    }
}