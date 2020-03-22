package local.java.basics;

class Test4{
    public void A(String s){
        System.out.println("String version");
    }
    public void A(StringBuffer sb){
        System.out.println("StringBuffer version");
    }
}
public class TestOverloading3 {
    public static void main(String[] args){
    Test4 t = new Test4();
    t.A("durga");
    t.A(new StringBuffer("durga"));
    //t.A(null);
    /*
    as the null is the valid value for both String and StringBuffer and both objects are childs of Object and they are
    in the same level of priority and they have not Is-A relation as well so the compiler can not resolve the right
    method in this case hence the compiler will rise ambiguity error
     */
    }
}
