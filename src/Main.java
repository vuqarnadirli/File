import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        String fileName="Cux.docx";
        String text = "Cux";

        FileUtility2.writeIntoFile(fileName,text);
    }
}