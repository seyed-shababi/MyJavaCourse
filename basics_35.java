public class basics_35 {
    public static void main(String[] args) {
        int[] x = new int[3];
        ;
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        /*
        - Once we create an array every array element by default initialized with default values,
        - When ever we try to print any reference variable  internally toString method will be called
         --> toString()  ---> which returns the class name +   @ + # code in hexadecimal form --->   [I@1b6d3586
         The toString() method returns the string representation of the object. If you print any object,
         java compiler internally invokes the toString() method on the object.
         So overriding the toString() method, returns the desired output,
         it can be the state of an object etc. depends on your implementation.
         */
    }
}