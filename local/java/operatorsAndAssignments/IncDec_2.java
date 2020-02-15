package local.java.operatorsAndAssignments;
public class IncDec_2{
    public static void incDec(){
        byte b = 10;
        System.out.println(b);
        b = b++;
        System.out.println(b);
        b = ++b; // valid
        System.out.println(b);
        //b = b + 1;  not valid ==> result is max(int, type value1 , type value2), which is int and int can no
        // be assign to byte.
    }
}