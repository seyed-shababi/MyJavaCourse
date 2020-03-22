package local.java.ExceptionHandelin;

class ExHa_9{
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("Wait for 10 seconds....");
        for(int i = 1; i < 11; i++){
            System.out.println("Second " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("An error occurred!");
            }
        }

        System.out.println("Hello again!");
    }
}