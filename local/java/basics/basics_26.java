package local.java.basics;

public class basics_26{
    public static void main(String[] args){
        int[] a = new int[3];   // one dimension array
        System.out.println(a.getClass().getName());
        int[][] x = new int[5][2];
        System.out.println(x.getClass().getName());  // two dimension array
        double[] d = new double[2];
        System.out.println(d.getClass().getName());
        byte[] b = new byte[5];
        System.out.println(b.getClass().getName());
        short[] s = new short[5];
        System.out.println(s.getClass().getName());
        boolean[] B = new boolean[6];
        System.out.println(B.getClass().getName());

    }
}
/*
for every array type corespond classes
are there which are part of java lamguage and not
available to the programer level
 */