public class basics_39{
    public static void main(String[] args){
        int[]   x = new  int[3];
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 50;
        x[0] = 2.5;  // here as the mistake is the compiler catches the mistake and runs the CE of
                     //Error:(9, 16) java: incompatible types: possible lossy conversion from double to int
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        /*
        from here as the elements are out of range but they are not syntax error,
        so the compiler will not take care and will be compiled by compiler but at run time the mistake will be
        taken by java run time machine (java runtime environment)
         */
        System.out.println(x[3]);
        System.out.println(x[4]);
        System.out.println(x[5]);

    }
}