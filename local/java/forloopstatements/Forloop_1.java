package local.java.forloopstatements;

public class Forloop_1{
    public static void for_1(){
        for (int i = 0; i < 3; i++){
            System.out.println("Hello");
        }
        for ( int i = 0, j = 10 ; i < 3 ; i++){
            System.out.println("two variables from the same type");
        }
        /*for ( int i = 0, String s = "durga"; i < 3 ; i ++){
            System.out.println("multi type declaration is not allowed!");
        }*/
        int i = 0;
        for (System.out.println("Hey! are you sleeping?"); i < 3 ; i++){
            System.out.println("No, only you are sleeping!");
        }
    }

}