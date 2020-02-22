package local.java.transferStatement;

public class Trans_1{
    public static void break_1(){
        int x = 10;
        switch (x){
            case 10 :
                System.out.println(10);
            case 20 :
                System.out.println(20);
                break;  //we can use the break statement in switch to stop fall trough
            case 30:
                System.out.println(30);
            default:
                System.out.println("def");

        }
    }
}