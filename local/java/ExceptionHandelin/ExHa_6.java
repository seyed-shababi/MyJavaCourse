/*
it is program which has a risky code, and the risky code is handled by programmer so that the program will not
terminate abnormally instead will continue to the next statement
 */

package local.java.ExceptionHandelin;

class ExHa_6{
    public static void main(String[] args){
        System.out.println("Statement 1");
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("Attention: Division by Zero is not valid!");
        }
        System.out.println("Statement 3");
    }
}