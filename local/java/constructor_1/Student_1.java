package local.java.constructor_1;

class Student_1{
    String name;
    int rollNr;
    Student_1(String name, int rollNr){
        this.name = name;
        this.rollNr = rollNr;
        System.out.println(name +" --> " + rollNr);
        }
    public static void main(String[] args){
        Student_1  s1 = new Student_1("Farid", 101);
        Student_1  s2 = new Student_1("Soheil", 102);
        Student_1  s3 = new Student_1("Abtin", 103);
    }
}
