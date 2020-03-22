package local.java.basics;

public class basics_38{
    public static void main(String[] args) {
        int[] x = new int[6];
        /* till now i created an array which by
           default all elements are set to 0, run bellow
           statements to see as prove.*/
        System.out.println(x[0] + " " + x[1] + " " + x[2] + " "+ x[3] + " "+ x[4] + " " + x[5] );
        /*
        but it is usual that we are not satisfy with default value of all elements to be in zero,
        so that we can overwrite default values based on our requirements as the lines bellow.
         */
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 50;
        x[5] = 60;
        System.out.println(x[0] + " " + x[1] + " " + x[2] + " "+ x[3] + " "+ x[4] + " " + x[5] );
    }
}