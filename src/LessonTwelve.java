import java.io.*;
import java.nio.charset.StandardCharsets;

public class LessonTwelve {
    public static void main(String[] args) {
/*        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("file.txt");
            int a;
            while ((a = fileInputStream.read()) != -1) {
                System.out.println((char) a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
/*        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            byte[] bytesArray = fileInputStream.readAllBytes();
            String value = new String(bytesArray);
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
/*        try (FileOutputStream fileOutputStream = new FileOutputStream("file1.txt")) {
            String someVale = "Hello World";
            fileOutputStream.write(someVale.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
/*        try (FileReader fileReader = new FileReader("file.txt")) {
            int a;
            while ((a = fileReader.read()) != -1) {
                System.out.println((char) a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
/*        try (FileWriter fileWriter = new FileWriter("file2.txt")) {
            String value = "Hello World";
            fileWriter.write(value);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
/*        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
                System.out.println(bufferedReader.readLine());
        } catch (IOException e){

        }*/
/*        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                System.out.println(value);
            }
        } catch (IOException e){

        }*/
/*        try (BufferedWriter writer = new BufferedWriter(new FileWriter("text3.txt"))){
            String value = "Hello World123";
            writer.write(value);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
