package local.java.operatorsAndAssignments;

import sun.java2d.loops.GraphicsPrimitive;

public class EquOp_1{
    public static void equa(){
        System.out.println(10 == 20);
        System.out.println('a' == 20); //internally the smaller data type will convert to bigger data type char==>int
        System.out.println('a' == 'a');
        System.out.println('a' == 'C');
        System.out.println(false ==false); //equality is applicable for boolean also
        System.out.println(10.5 == 20); //internally the smaller data type converts to bigger data type  int==>Double
        System.out.println(10 == 20.5);
        System.out.println('d' == 20.2);
        System.out.println("durga" == "durga");
            // result is true only and if only both variables are reffering to the same object (The object is same)
        System.out.println("durga" != "farid"); // true ==> objects are not same ==> object address is same
        System.out.println("durga" == "farid");  // false ==> objects are not same ==> object addresses are not same

        System.out.println();
        System.out.println();

        // another example:
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        System.out.println(t1 == t2); //false ==> objects are not same
        System.out.println(t2 == t3); //false ==> objects are not same
        System.out.println(t3 == t1); //true ==> object is same


    }
}