package local.java.basics;

public class basics_27{
    public static void main(String[] args){
        System.out.println(args.length);
    }
}


// if you run this code you see that if you do not pass any
// arguments the length is 0 and if you pass the length will differ.


/*
Int []    a = new    int[0] ===> it is legal to have an array with the size of zero and there is no problem.
A prove for that is :
	Class Test
		{ public static void main(String[] args){
System.out.println(args.length);
 */