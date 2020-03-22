// The Exception will be handled by my caller which is in this case ExHa_12
package local.java.ExceptionHandelin;

public class ExHa_11{
    public static void waiting() throws InterruptedException
    {
        System.out.println("Hello");
        System.out.println("Wait for 10 seconds....");
        for(int i = 1; i < 11; i++){
            System.out.println("Second " + i);
            Thread.sleep(1000);
        }
        System.out.println("Hello again!");
    }
}

