public class Main {
    public static void main(String[] args) throws Exception {

//        byte[] data = FileUtility2.readBytes("test.jpg");
//
//        FileUtility2.writeBytes("test2.jpg", data);
//
//        byte[] readingData = NioFileUtility.readBytes("Cux.txt");
//
//        System.out.println(new String(readingData));

        String str = "Writing data";
        byte[] content = str.getBytes();

        NioFileUtility.writeBytes(content,"write.txt");


    }
}