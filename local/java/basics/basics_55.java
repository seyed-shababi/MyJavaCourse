package local.java.basics;

public class basics_55{
    public static void main(String[] args){
        int[] a = {10, 20, 30, 40, 50};
        for(int i : a) {
            System.out.println(i);
        }
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}