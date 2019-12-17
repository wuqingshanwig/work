package work;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoFileInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IOtest\\a.txt");
        FileInputStream fis = new FileInputStream(file);

        byte[] bytes = new byte[512];
        System.out.println(fis.available());
        fis.read(bytes);
        System.out.println(new String(bytes));

        fis.close();
    }

}
