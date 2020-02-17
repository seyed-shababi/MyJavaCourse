package local.java.typeCasting;

public class T_casting_2{
    public static void cast(){
        int x1 = 10;
        int y = 130;
        int z = 150;
        double d1 = 130.456;

        //byte b = x; // gives CE: because how we can assign bigger data type (int) to smaller data type (byte)
        byte b1 = (byte)x1;
        System.out.println(b1);  // valid because the int is converted to byte explicitly
        byte b2 = (byte)y;
        System.out.println(b2);
        /* no CE but as 130 is bigger than
           2 bytes(byte size is two byte) the
           result is not correct which in this case is -126
         */
        short s1 = (short)z; // the result is correct as short is 16 bits and result is in the range of short
        byte b3 = (byte)z; // the result is not correct as byte is 8bits and result is not in the range of byte
        System.out.println(s1);
        System.out.println(b3);
        System.out.println();

        int x2 = (int)d1;
        System.out.println(d1); // digits after decimal point will be gone by explicit type casting of double to int
        short s2 = (short)d1;
        System.out.println(s2);
          /* first the d1 will be converted to int and lose the digits
             after decimal points then again will be converted to short
             which in this case the result is in the range of short and
             there is no loss of information
          */
        byte b4 = (byte)d1;
        System.out.println(b4);
           /* first convert to int then to byte,
              which in this case the result has loss of information
           */



    }
}