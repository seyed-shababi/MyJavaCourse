public class basics_79{
    public static void main(String[] args){
        System.out.println(args[0]);
        //System.out.println(args[1]);
    }
}
/*
if you run this code in command line with the argument of note book your output is note and not note book
because there is a space between note and book and it is a sign in java that space in command line separates
the elements from each other, means for me that note is args[0] and book is args[1], but if i like to
have them as one element then i have to enclose them in "" in command line ==>  java basics_79 "note book"
 */