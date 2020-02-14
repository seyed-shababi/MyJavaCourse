package local.java.operatorsAndAssignments;
public class IncDec_1{
    public static void incDec(){
        int y;
        int x = 10;
        System.out.println("y = ++x is " + (y = ++x));
        System.out.println("y = ++x is " + (y = x++));
        System.out.println("y = --x is " + (y = --x));
        System.out.println("y = x-- is " + (y = x--));
    }
}