import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    public static void writeDBAndTblNameFile(String text,String fileName){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(text);
            System.out.println("Done");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
