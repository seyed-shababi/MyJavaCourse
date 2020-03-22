package local.java.basics;

class Test5{
    public void A(int i, float f){
        System.out.println("int-float version");
    }
    public void A(float f, int i){
        System.out.println("float-int version");
    }
}
public class TestOverloading {
    public static void main(String[] args){
        Test5 t = new Test5();
        t.A(10, 10.5f);
        t.A(10.5f, 10);
        //t.A(10, 10);
        /* here first 10 match with A(int i, float f) and as second argument is math in both cases
        the ambiguity occurs*/
        //t.A(10.5f, 15.5f); // here first arg is match but second arg is not convertible to int type
    }
}
/*
as i see here in the above example the order is important so that means if there are two methods with the
same name and two arguments of same type and in different orders so the overloading is correct.
 */
