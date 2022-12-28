import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility2 {
    public static void  writeIntoFile(String fileName,String text) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(text);
        bw.close();
    }
}
