package local.java.basics;

public class basics_68{
    public static void main(String[] args){
        m1();// var-arg wins because var-arg accept any method including 0 but general method expect one parameter which not provided here.
        m1(10); // here both general method and var-arg method matched the condition but general method wins because it is older and and var-arg is new in java(old is gold)
        m1(10,20);// here simply is var-method and not general method

        /*
        in general var-arg method is like default in switch cases the last method that gets the chance
         */
    }
        public static void m1(int... x){
            System.out.println("Var-arg method");
        }
        public static void m1(int x){
            System.out.println("General method");
        }




}