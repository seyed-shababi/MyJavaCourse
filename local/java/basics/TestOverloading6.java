package local.java.basics;

class Test6{
    public void A(int i){
        System.out.println("General number");
    }
    public void A(int... x){
        System.out.println("var-arg method");
    }
}
public class TestOverloading6 {
    public static void main(String[] args){
        Test6 t = new Test6();
        t.A();  // var-arg method can contain any number of arguments including zero
        t.A(10, 20); // var-arg method can contain any number of arguments including zero
        t.A(10);  /*  here as 10 matches for both methods the general method wins as
                        it is older in java that var-arg,
                        also var-arg method is like default statement in switch which
                        is get the chance if no cases are matched
                    */
    }
}
