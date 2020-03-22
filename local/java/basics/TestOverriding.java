package local.java.basics;

class Parent{
    public void property(){
        System.out.println("Gold, Land, Cash");
    }
    public void marriage(){
        System.out.println("Marry with Celine Dione"); // overridden method
    }
}
class Child extends Parent{
    public void marriage(){
        System.out.println("Marry with Heyedeh");  // overriding the marriage method by child class
    }
}
public class TestOverriding {
    public static void main(String[] args){
        Parent p1 = new Parent();
        p1.property();
        p1.marriage();
        Child c1 = new Child();
        c1.property();
        c1.marriage();
        Parent p2 = new Child();
        p2.property();
        p2.marriage();
        /* the method resolution in overriding is taking care by jvm in run time
           and it is based on child, hence here instead on calling the marriage
           method of parent the method of child has been invoked
        */

        // Child c2 = new Parent();  // child can not hold the parent object

    }
}
