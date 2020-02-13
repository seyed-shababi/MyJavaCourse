public class basics_75{
    public static void main(String[] args){
        System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        for (String i : args){
            System.out.println(i);
        }
        for (String i : args){
                System.out.println("args[" + i.indexOf(i) + "] " + "is " + i);
            }
    }

}
        /*
        an example of command line arguments,
        it can be compiled and run from command line:
        javac basics_75.java
        java basics_75 q b d

         */