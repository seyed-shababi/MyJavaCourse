package local.java.forloopstatements;

public class Forloop_5{
    public static void for_5(){
    int[][] x = {{10,20,30},{40,50}};
    for (int i = 0 ; i < x.length ; i++){   // printing elements of two dimensional array by using normal for loop
        for(int j = 0; j < x[i].length ; j++){
            System.out.println(x[i][j]);
        }
    }
        System.out.println("");

    for ( int[] x1 : x){ // printing the same elements by using for each loop
        for (int x2 : x1){
            System.out.println(x2);
        }

    }

    }
}