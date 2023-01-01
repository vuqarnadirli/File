import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFileUtility {
    public static void writeBytes(byte[] data,String fileName) throws Exception{
        Path path = Paths.get(fileName);
        Files.write(path,data);
    }

    public static byte[] readBytes(String fileName) throws Exception{
        Path path = Paths.get(fileName);
        byte[] byteArray = Files.readAllBytes(path);
        return byteArray;
    }
}
