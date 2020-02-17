package local.java.assignmentOperators;

public class Assignment_operator_1{
    public static void assign(){
        System.out.println();
        int x1 = 10; // simple assignment
        System.out.println("x1 is " + x1);
        //int x2 = a = b = c = d = 20;
        /* we can not perform chain assignment by declaring directly lie last line above,in the case above i am trying
        to use the a b c d without declaring them which causes the CE , so the correct way is in the line bellow:
         */
        System.out.println();
        int x2, a, b, c, d;
        x2 = a = b = c = d = 20; // now variables are already declared so i can use them in this line of code
        System.out.println("x2 is "+ x2 + " ," + "a is " + " ," +a + "b is " + b + " ," + "d is " + b);
        System.out.println();
        int x3 = 30; // Component assignment
        x3 += 10;
        System.out.println(x3);
    }
}