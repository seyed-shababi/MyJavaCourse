package local.java.ExceptionHandelin;

class ExHa_4{
    public static void main(String[] args){
        System.out.println("How are you?");
        doStuff();
        System.out.println(10/0);
    }
    public static void doStuff(){
        System.out.println("Hello");
        doMoreStuff();
    }
    public static void doMoreStuff(){
        System.out.println("Good day");
    }
}