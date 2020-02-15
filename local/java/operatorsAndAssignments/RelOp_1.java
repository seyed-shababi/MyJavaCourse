package local.java.operatorsAndAssignments;

public class RelOp_1{
    public static void rel(){
        System.out.println(10 < 20);  //true
        System.out.println('a' < 20); // false
        System.out.println('a' < 97.6); //  true
        System.out.println('a' < 'A');  // false
        //System.out.println(false < true); // CE: operator > can not be apply to boolean,boolean
            /*
            relational operators are applicable for all primitive data types except boolean
             */
        //System.out.println("durga123" > "durga");
            //relational operator is not applicable for object
        //System.out.println(10 < 20 < 30);
            /*
            the result of ( 10 < 20 < 30 ) ==> first 10 < 20 ==> true then ==>  true < 30
            results compile time error
             */
    }
}