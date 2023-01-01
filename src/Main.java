import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        byte[] data= FileUtility2.readBytes("test.jpg");

        FileUtility2.writeBytes("test2.jpg",data);


    }
}