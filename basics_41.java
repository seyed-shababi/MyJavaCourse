import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class basics_41 {
    public static void main(String[] args) {
        int[][] x = new int[6][3];
        System.out.println(x.length);
        System.out.println(x[0].length);
        // event it is an two dimension arrays but the length variable is applied to only to first dimension.
        //there is no direct way to specify total lenght of dimention of array but indirectly we can find as follow:
        int lenghToral = x[0].length + x[1].length + x[2].length + x[3].length + x[4].length + x[5].length;
        System.out.println(lenghToral);

    }

}