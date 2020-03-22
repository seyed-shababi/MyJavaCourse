package local.java.basics;// example of abstract method

abstract class vehicule{
    abstract public int getNumOfWheels();//  abstract method declaration should be end with semi colon
    /*
     here as we still dont know which vehicul is so the number of wheels are not
    clear for us , but still we can declare the method without implementing by using abstract modifier and we leave the
    implementation for child classes which are more specific.
    */

}
class Buss extends vehicule{
    public int getNumOfWheels(){
        return 6;
    }
}
class Auto extends vehicule{
    public int getNumOfWheels(){
        return 4;
    }
}