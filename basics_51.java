import java.sql.SQLOutput;

public class basics_51{
    public static void main(String[] args){
        int[] temp = null;
        int[] a = {10, 20, 30, 40, 50, 60};
        int[] b = {70, 80};
        temp = a;

        System.out.println(a = b);
        System.out.println(b = a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(temp[0]);
        if (a == b){
            System.out.println(true);
        }
        /*
        whenever we are trying to assign an array to another array internally the elements wont be copied,
        instead the reference will be moved.
        - when we are assigning one array to another array internal elements wont be copied just reference variable
        will be reassigned, and the array size is not important but the type of the array should be the same!
         */

    }
}