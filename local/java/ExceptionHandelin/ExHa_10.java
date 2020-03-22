package local.java.ExceptionHandelin;

class ExHa_10{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        System.out.println("Wait for 10 seconds....");
        for(int i = 1; i < 11; i++){
            System.out.println("Second " + i);
            Thread.sleep(1000);
        }
        System.out.println("Hello again!");
        }
}