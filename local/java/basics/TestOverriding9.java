package local.java.basics;

class Parent10{
    public void A(int... i){
        System.out.println("parent");
    }
}
class Child10 extends Parent10{
    public void A(int i){
        System.out.println("Child");
    }
}

public class TestOverriding9 {
    public static void main(String[] args){
        Parent10 p1 = new Parent10();
        p1.A(10);
        p1.A(10,20);
        Parent10 p2 = new Child10();
        p2.A(10);
        p2.A(10,20);
        Child10 c1 = new Child10();
        c1.A(10);
        c1.A(10,20);
    }
}
/*
we can override var-arg method with another var-arg method only,
by mistake if we try to override a var-arg method with
a normal method then it will be came overloading buy not overriding
 */
