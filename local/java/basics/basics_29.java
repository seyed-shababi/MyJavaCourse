package local.java.basics;

public class basics_29{
    public static void main(String[] args){
        int[]  i = new  int[4];  // int used
        int[]   r = new int['s'];  // char used
        int[]   f = new int[2];   // byte used
        int[]   s = new int[5];     //short used
        //int[]  b = new int[10l];  not allowed, causes the ce
        //int[]  b = new int[10.2f];  not allowed, causes the ce
        //int[]  b = new int[2.2];  not allowed, causes the ce

        /*
        To specify array size the allowed data types are :
         byte, short. Char and int .
         Other type of data will cause the PLP compile time error.

         */
    }
}