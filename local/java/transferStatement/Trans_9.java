package local.java.transferStatement;
public class Trans_9 {
    public static void lable_5(){
        l1:
        for ( int i = 0 ; i < 3 ; i++){
            l2:
            for ( int j = 0 ; j < 3 ; j++){
                if ( i == j)
                    continue l1;
                System.out.println(i + " " + j);
            }
        }
    }
}
