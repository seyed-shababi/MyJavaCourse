package local.java.basics;

class Test3{
    public void A(String s) {
        System.out.println("String version");
    }
    public void A(Object o){
            System.out.println("Object version");
    }
}
public class TestOverloading2 {
    public static void main(String[] args){
        Test3 t = new Test3();
        t.A("durga");
        t.A(null);  // null is the valid value for String and Object but the output is String version
        /*
         null is a valid value for String and also for Object but as the string is the child of Object,
         so the compiler always will resolve the value in low level if exist, which in this case the null is mostly
         closes to String instead of Object
         */


    }
}
