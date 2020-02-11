public class basics_67{
    public static void main(String[] args){
        sum(12, 12 ,12 ,25);
    }
    public static void sum(int... x){
        int total = 0;
        for (int i : x){
            total = total + i;
            System.out.println("The sum is :" + total);
        }
    }
}