package local.java.basics;

public class basics_28{
    public static void main(String[] args){
        int[]  i = new int[-3];
        System.out.println(i);
    }
}





/*
In this case which we try to make an array with
size of negative , as we pass the size in integer
value we do not get compile time error but at the
time of running the java virtual machine gets shock
-as the size can not be negative-
by seeing the negative value as a size so that we get
 run time error of :  NegativeArraySizeException
 */