// here i am going to handle the Exception handed over me by ExHa_11

package local.java.ExceptionHandelin;

import local.java.ExceptionHandelin.*;

class ExHa_12{
    public static void main(String[] args){
        ExHa_11 ex = new ExHa_11();
        try{
            ex.waiting();
        }
        catch (InterruptedException e){
            System.out.println("Exception is handled by me!");
        }
    }
}