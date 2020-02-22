package local.java.transferStatement;

public class Trans_3{
    public static void break_3(){
        int x = 10;
        l1:
        {
            System.out.println("begin");
            if (x == 10){
                break l1;
            }
        }
            System.out.println("end");

    }
}