public class basics_65{
    public static void main(String[] args){
        m1();
        m1(10);
        m1(10,20);
        m1(10,20,30,40);
        m1(10,20,3,40,50,60,70,80,90,100);
    }

    public static void m1(int... x){
        System.out.println("The number of arguments:" + x.length);
    /*
    as you see here, internally var-arg parameter wil converter to one dimention array hence within the var-arg method
    we can differential values by using index
     */


    }

}
