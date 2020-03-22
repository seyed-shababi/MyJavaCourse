// Customized exception handling by try catch
package local.java.ExceptionHandelin;

class ExHa_7{
    public static void main(String[] args){
    try{
        System.out.println(10/0);
        }
    catch(ArithmeticException e){
        //e.printStackTrace(); // this method will print complete information about occurred Exception (name of Exception, Description, Stack trace
        //System.out.println(e); // this method will print the reason of the Exception only (name of exception, description)
        System.out.println(e.getMessage()); // this method is printing the message of the Exception only( description)
        }
    }
}