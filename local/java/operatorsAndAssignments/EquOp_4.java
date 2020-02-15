package local.java.operatorsAndAssignments;

public class EquOp_4{
    public static void equa(){
        String s1 = new String("durga");
        String s2 = null;
        System.out.println(s1 == null); // false always ==> objects that already is referenced are not == null
        System.out.println(s2 == null); // true ==> s2 is assigned to null and null == null is always true
        System.out.println(null == null); // true ==> null == null is always null because null is an object
    }
}