package local.java.ExceptionHandelin;

class ExHa_3{
    public static void main(String[] args){
        doStuff();
    }
    public static void doStuff(){
        doMoreStuff();
        System.out.println(10/0);
    }
    public static void doMoreStuff(){
        System.out.println("Hello");
    }

}