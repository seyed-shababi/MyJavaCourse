package local.java.basics;

class Parent2{
    public Object m1(){
        return null;
    }
}
class Child2 extends Parent{
    public String m1(){
        return null;
    }
}
public class TestOverriding2 {
    public static void main(String[] args){
        Parent2 p1 = new Parent2();
        p1.m1();
        Child2 c1 = new Child2();
        c1.m1();
    }
}
/*
as you see here in the example above in overriding from 1.5 version onwards it is possible to override the parent method
return type, but only the child objects of the return type is allowed   for ex: Object   can be override to String or
StringBuffer
 */
