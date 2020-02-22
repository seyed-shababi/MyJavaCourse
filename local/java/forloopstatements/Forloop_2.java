package local.java.forloopstatements;

public class Forloop_2{
    public static void for_2(){
        for ( int i = 0 ; ; i++){ // as we dont perform conditional check here compiler provides true
            System.out.println("hello from loop without conditional check" + i);// results infinite number of statement
        }
    }
}