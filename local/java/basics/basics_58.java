package local.java.basics;

public class basics_58{
    int a = 20;
    String s = "Durga";
    static int x = 50;
    public static void main(String[] args){
        basics_58 b1 = new basics_58();
        System.out.println(b1.a);//to access instance variable we required to access by using object reference
        System.out.println(b1.s);//to access instance variable we required to access by using object reference
        System.out.println(b1.x);// to access the static variables by using the object reference but not recommended as the code readability will be reduced
        System.out.println(basics_58.x);// to access the static variables we can use class reference perfectly
        System.out.println(x);// to access the static variables we can access directly perfectly
    }
    public void m1(){
        System.out.println(x);// the static variable can be accessed directly from both instance and static areas
    }

        }