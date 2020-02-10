public class basics_64{
    public static void main(String[] args){
        m1();
        m1(10);
        m1(10,20);
        m1(10,20,30,40);
        m1(10,20,3,40,50,60,70,80,90,100);
    }

    public static void m1(int... x){
        System.out.println("Var-arg method");
    /*
    as you see here var-arg method let us to use any number of int as arguments int the same method.
     */


    }

}
