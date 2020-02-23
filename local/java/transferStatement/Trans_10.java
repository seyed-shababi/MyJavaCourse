// combination of do-while & continue

package local.java.transferStatement;

public class Trans_10{
    public static void conutine_6(){
        int x = 0;
        do {
            x++;
            System.out.println(x);
            if(++x < 5)
                continue;
            x++;
            System.out.println(x);
        }
        while(++x < 10);
    }
}