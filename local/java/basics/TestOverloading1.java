package local.java.basics;// automatic promotion is overloading

class Test1{
    public void A(int i){
        System.out.println("This is an int");
    }
    public void A(float f){
        System.out.println("This is a float");
    }
}
public class TestOverloading1{
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.A(10);
        t.A('A');// 'A' will be promoted to int by compiler
        t.A(10.5f);
    }
}