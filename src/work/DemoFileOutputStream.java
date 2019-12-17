package work;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IOtest\\a.txt");
        fos.write(97);
        fos.close();
    }

}
