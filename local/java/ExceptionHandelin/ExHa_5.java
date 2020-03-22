/*
a program with risky code which is not handled by programmer so the default Exception raised
and terminates the rest of the program abnormally
 */

package local.java.ExceptionHandelin;

class ExHa_5{
    public static void main(String[] args){
        System.out.println("Statement 1");
        System.out.println(10/0);
        System.out.println("Statement 3");
    }
}