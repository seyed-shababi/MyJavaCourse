package local.java.typeCasting;

public class T_casting_3{
    public static void cast(){
        byte b1 = 10;
        /* b1 = b1 + 1; // in normal arithmetic internal type casting is not performed in java,
           so 1 is byte and the result will be max(int, type b1 , type 1)
           which is int and cannot be assigned to byte
        */

        b1 ++;  // valid. internal type casting is performed ==> b1 = (byte)(b1 + 1) in incrementing and decrementing
        System.out.println(b1);
        System.out.println();

        b1 += 1; //  valid. in component assignment internal type casting is performed ==> b1 = (byte)(b1 + 1)
        System.out.println(b1);
    }
}