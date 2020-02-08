public class basics_56{
    int x = 10;


    public static void main(String[] args){
        //System.out.println(x);  // error: we can not access the instance variable directly from static area
        basics_56 b = new basics_56();
        System.out.println(b.x); // we can access to the instance variable by using the object reference

    }
    public void m1(){
        System.out.println(x);// we can access instance object directly from instance area
    }
}