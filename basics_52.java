import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class basics_52{
    public static void main(String[] array){
        int[][] a = new int[3][];
        //a[0] = new int[2][3]; ==> error: inc type ==> found:int[][] required:int[]
        //a[0] = 10; ==> error: inc type ==> found: int required: int[]
        a[0] = new int[10]; // valid ==> the array expected the array object which we provided.
        System.out.println(a[0]);
        /*
        whenever we are assigning one array to another array dimension must be matched,
        for example in the place of one dimension array we should provide one dimensional array only.
        if we try to provide any other dimension then we will get compile time error.
        note: whenever we assign an array both dimensions and type must to
        be matched but size is not required to be match.
         */
    }

}
