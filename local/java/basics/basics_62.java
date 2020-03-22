package local.java.basics;

public class basics_62{
    int[] x ;
    public static void  main(String[] args){
        basics_62 b1 = new basics_62();
        System.out.println(b1.x);
        System.out.println(b1.x[0]);
        /* when ever we declare an instance array but we dont initialize it the default value for the array will be null,
        but for the elements of array there will not any default value
        will be provided therefore we see the NullPointreException
          */
    }
}