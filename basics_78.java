public class basics_78{
    public static void main(String[] args){
        System.out.println(args[0] + args[1]);
        /*
         here the result is not the + operator
         as arguments are in String but they
         will be concatenating, means 1020 and not 30
        */

        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]) );
        // here the parsing happened and the result is 30 as arguments are converted to int type



    }
}