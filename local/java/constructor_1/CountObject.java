/*
demo program to print number of objects created for a class
 */
package local.java.constructor_1;

class MakeObject{
    static int count = 0;
    {
        count ++;
        //System.out.println(count);
    }
    MakeObject(){}
    MakeObject(int i){}
    MakeObject(double d){}
}
public class CountObject {
    public static void main(String[] args){
        MakeObject mk1 = new MakeObject();
        MakeObject mk2 = new MakeObject(10);
        MakeObject mk3 = new MakeObject(10.5);
        System.out.println("So far " + MakeObject.count + " has been created.");
    }
}
