package local.java.testenv;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateFile{
    public static void  creatingFile(){
        try{
            PrintWriter pw = new PrintWriter("C:/Users/Farid/IdeaProjects/Tutorials_Durga/src/local/java/testenv/FreshFile.java");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found, check your file destination!");
        }

    }
}

