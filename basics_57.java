public class basics_57{
    int a;
    double d;
    boolean b;
    String s;
    public static void main(String[] args){
        basics_57 b1 = new basics_57();
        System.out.println(b1.a); // default value is 0
        System.out.println(b1.d); // default value is 0.0
        System.out.println(b1.b); // default value is false
        System.out.println(b1.s); // default value is null
    }
    /*
    for instance variables are not required to be initialized immediately/explicitly , jvm(java runtime machine) time will provide the default value in
    these cases
     */
}