public class basics_60{
    static int x = 50;
    int y = 10;
    int z = 20;
    public static void main(String[] args){
        basics_60 b1 = new basics_60();
        b1.x = 500;
        b1.y = 100;
        b1.z = 200;
        System.out.println(b1.x +" "+ b1.y +" "+ b1.z);
        basics_60 b2 = new basics_60();
        System.out.println(b2.x +" "+ b2.y +" "+ b2.z);
        /*
       as we see in thins example static variables are not copied in every onject creation instead they are shared among all objects
       but the instance variables are copied from the class level by each object creation and any change of them withing any object does not
       reflect to other copy of the same variable in the class level or object level
       
         */
    }
}