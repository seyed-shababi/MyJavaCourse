public class basics_21{
    public static void main(String[] args){
        int x = 10;
        int y = 010;
        int q = 0x10;
        int g = 0X10;
        System.out.println(x);
        System.out.println(y);
        System.out.println(q);
        System.out.println(g);
    }
}

/*In how many ways we can specify the integral values:
These are only possible ways to specify the value in integral value:
Binary (based 2)                 -->  int x =
Decimal (based 10)            -->  int x = 10;  ( allowed numbers are 0 to 9)
Octal (based 8)                    -->  int x = 010;  (The value is prefixed with 0)
(The allowed numbers are 0                                 to 7)
Hexadecimal (based 16)    --> int x = 0x10;  (The value is prefixed with 0x )
( The allowed numbers are 0 to 9 and A to F)(for extra digits a to f we can use both lower
case or upper case characters --> this is one of few areas
where is java is not case sensitive.
*/

