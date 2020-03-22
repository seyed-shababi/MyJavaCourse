package local.java.basics;

public class basics_61{
    public static void main(String[] args){
        int[] x = {10, 20, 30, 40, 50};
        for (int i : x){
            System.out.println(i);
        }
        /*
        as you see here in this example to print out the elements in x we make a temporary variable of i,
        which is only available inside the for loop and after the block of for loop will no longer available.
        in this case the i is a local variable.
         */
    }
}