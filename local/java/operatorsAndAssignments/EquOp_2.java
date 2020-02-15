package local.java.operatorsAndAssignments;

public class EquOp_2{
    public static void equObj(){
        Thread t1 = new Thread();
        Object o1 = new Object();
        String s1 = new String();
        // i just created three objects from different objects
        System.out.println(t1 == o1); //valid, because there is a relation between two objects==>o1 is the parent of t1
        //System.out.println(t1 == s1);//not valid, there is no relation, Thread and String both are the child of Object
        System.out.println(o1 == s1);// valid, there si a relation between both objects
    }
}