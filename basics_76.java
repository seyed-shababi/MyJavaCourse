public class basics_76{
        public static void main(String[] args){
                int n = Integer.parseInt(args[0]);
                //System.out.println("The square of " + n + " is " + (n * n));
                for (String i : args){
                       int b = Integer.parseInt(i);
                        System.out.println("The square of " + b + " is " + (b * b));
                }
        }
}
                /*
                as you see here in this code by helping of Integer.parsInt() method we convert the string arg given in command
                line we get the int of the argument and from there we may provide the math operations on it
                 video 15
                 */