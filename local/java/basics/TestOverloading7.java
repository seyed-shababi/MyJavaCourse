package local.java.basics;

class Animal{
}
class Monkey extends Animal{
}
class Test7{
    public void A(Animal a){
        System.out.println("Animal version");
    }
    public void A(Monkey m){
        System.out.println("Monkey version");
    }
}
public class TestOverloading7 {
    public static void main(String[] args){
        Test7 t = new Test7();
        Animal a1 = new Animal();
        t.A(a1);
        Monkey m = new Monkey();
        t.A(m);
        Animal a2 = new Monkey();
        t.A(a2);
    }
}
