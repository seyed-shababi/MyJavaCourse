public class basics_66{
    public static void main(String[] args){
        sum();
        sum(1,20);
        sum(20,80,12);
        sum(30,54,909,12,5643);
    }
    public static void sum(int... x){
        int total = 0;
        for (int i : x){
            total = total + i;
        }
        System.out.println("The sum is " + total);
        /*
        as you see here in this example the art of var-arg method is that you make one method and you call any time you
        want and you pass any value based on your reauirment 
         */
    }
}