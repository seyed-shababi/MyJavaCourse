public class basics_34{
    public static void main(String[] args){
        int x = 10;
        double y = 3;
        float f = 4.0f;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println("x + y = " + (x + y));
        System.out.println(("x - y = ") + (x - y));
        System.out.println(("x * y = ") + (x * y));
        System.out.println(("x / y = ") + (x / y));
        System.out.println("x * f = " + (x * f));
        /* in java when we mixed int and double or float
        internally int type will be converted to
        double or float so that the result comes in double or float
        */
    }
}