/*
Difference between == operator and .equal() method:
    ==  operator check if the refference of both objects are same or not
    .equals() method checks if the contents of both values are same or not

 */


package local.java.operatorsAndAssignments;


public class EquOp_3{
    public static void equa(){
        String s1 = new String("durga");
        String s2 = new String("durga");
        String s3 = s1;
        System.out.println(s1 == s2); // false ==> because they are not pointed to the same object
        System.out.println(s1.equals(s2));// true ==> because their contents are same and equal
        System.out.println(s1 == s3);// true ==> because both s1 and s3 are pointed to the same object
        System.out.println(s1.equals(s3)); //true ==> because content is same

    }
}