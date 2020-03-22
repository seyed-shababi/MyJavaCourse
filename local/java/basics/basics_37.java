package local.java.basics;

public class basics_37{
    public static void main(String[] args){
        int[][]   x = new   int[2][];
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
        /*
        here in this example as we dont specify the second array of each elements in first dimension
       by default the second dimension array will not be created but the object as a whole is created without any array,
       so that there is no elements in second dimension and and the object will be a null, and if it is the null object
       then if we try to do any operation on the null object we get an error at run time --->   NPE
       for more infos look back at the video 7.
       note :  if we are trying to perform any operation on null then
       we will get run time exception of null pointer exception
         */
    }
}