
package local.java.forloopstatements;
public class Forloop_4{
    public static void for_4(){
        int[] x = {10, 20, 30, 40, 50};
        for(int i = 0 ; i < x.length; i++){  // retrieving the elements of an one dimensional array by using normal for loop
            System.out.println(x[i]);
        }
        System.out.println("");
        for( int x1 : x){ // retrieving the elements of the same array by using for each loop
            System.out.println(x1);
        }

    }

}
