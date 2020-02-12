public class basics_73{
    public static void main(String[] args){
        System.out.println("Hello before jvm shutdown");
        System.exit(0);
        System.out.println("Hello after jvm shutdown");
    }
}
        /*
        here in this example System.exit(0) will shutdown the jvm and no more code will be executed.
         */