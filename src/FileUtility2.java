import java.io.*;

public class FileUtility2 {
    private static void writeIntoFile(String fileName, String text, boolean append) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, append))) {
            bw.write(text);
        }
    }

    public static void writeIntoFile(String fileName, String text) throws IOException {
        writeIntoFile(fileName, text, false);
    }

    public static void appendIntoFile(String fileName, String text, boolean append) throws IOException {
        writeIntoFile(fileName, text, append);
    }
//    public static void writeIntoFile2() {
//        FileOutputStream fop = null;
//        File file;
//        String content = "This is the text content";
//        try {
//            file = new File("");
//            fop = new FileOutputStream(file);
//
//            //if file doesn't exist, then create it
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//
//            //get the content in bytes
//            byte[] contentInBytes = content.getBytes();
//            fop.write(contentInBytes);
//            fop.flush();
//            fop.close();
//
//            System.out.println("Done");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fop != null) {
//                    fop.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public static void writeBytes(String fileName, byte[] data) throws IOException {
        FileOutputStream fop = new FileOutputStream(fileName);

        fop.write(data);
        fop.flush();
        fop.close();

        System.out.println("Done");
    }

    public static String readData(String fileName) throws IOException {
        InputStream inputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = null;
        String result = "";

        while ((line = bufferedReader.readLine()) != null) {
            result += line;
        }
        return result;
    }

    public static String readDataFromFile(String fileName) throws IOException {
        try (
                InputStream inputStream = new FileInputStream(fileName);
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {

            String line = null;
            String result = "";

            while ((line = bufferedReader.readLine()) != null) {
                result += line;
            }
            return result;
        }
    }

    public static byte[] readBytes(String fileName) throws IOException {

        File file = new File(fileName);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytesArray = new byte[(int) file.length()];
            fileInputStream.read(bytesArray);
            return bytesArray;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

//    public static byte[] readBytes(String fileName) throws IOException {
//        FileInputStream fileInputStream = null;
//        byte[] bytesArray = null;
//
//        File file = new File(fileName);
//        bytesArray = new byte[(int) file.length()];
//
//        //read file into bytes[]
//        fileInputStream = new FileInputStream(file);
//        fileInputStream.read(bytesArray);
//        return bytesArray;
//    }

    public static Object readFileDeserialize(String name) {
        Object obj = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }

    public static boolean writeObjectToFile(Serializable object, String name) throws RuntimeException {
        try (FileOutputStream fout = new FileOutputStream(name);
             ObjectOutputStream oos = new ObjectOutputStream(fout)) {
            oos.writeObject(object);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}


