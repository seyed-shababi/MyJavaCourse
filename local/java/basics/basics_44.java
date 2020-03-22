package local.java.basics;

public class basics_44{
    public static void main(String[] args){
        sumArray(new int[]{10, 20, 30, 40});
        /*sumArray(new int[4]{10, 20, 30, 40}); in case of creating the
        anonymous array we can not specify the length/size of array!*/
    }

    public static void sumArray(int[] x){
        int total = 0;
        for(int i : x){
            total = total + i;
        }
        System.out.println("The sum is: " + total);
    }
}