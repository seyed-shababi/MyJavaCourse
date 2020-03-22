package local.java.basics;

public class basics_77{
    public static void main(String[] args){
        String[] argh = {"A" , "B" , "C"};
        args = argh;
        for (String s : args){
            System.out.println(s);
        }
    }
}
        /*
        if you run this code in command line you will see that it does not
         matter which arguments you pass the output is always
        A B C because i pointed the args to argh which both are
        from the same type and args in no longer
        pointed the passing arguments from command line instead
         pointed to the args array
         */