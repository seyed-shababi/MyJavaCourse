package local.java.ExceptionHandelin;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class ExHa_8{
    public static void main(String[] args){
        try{
        PrintWriter pw = new PrintWriter("C:/Users/Farid/Desktop/docsJava/print3.txt");
        pw.println("Hello");
        System.out.println("Compiled and running successfully because of handling the possible Exception");
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred, file not found");
        }
    }
}