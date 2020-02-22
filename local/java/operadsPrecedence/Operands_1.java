package local.java.operadsPrecedence;

class Operands_methode{
    public static int Operands(int i){
        System.out.println(i);
        return i;
    }

}
public class Operands_1{
    public static void main(String[] args){
        Operands_methode o = new Operands_methode();
        System.out.println(o.Operands(1) + o.Operands(2) * o.Operands(3) / o.Operands(4) + o.Operands(5) * o.Operands(6));
    }
}