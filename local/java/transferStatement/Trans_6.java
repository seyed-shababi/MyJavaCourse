package local.java.transferStatement;
public class Trans_6{
    public static void lable_2(){
        l1:
        for ( int i = 0 ; i < 3 ; i++){
            l2:
            for ( int j = 0 ; j < 3 ; j++){
                if ( i == j)
                    break l1;
                System.out.println(i + " " + j);
            }
        }
    }
}
