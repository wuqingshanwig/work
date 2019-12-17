package wigmore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Work {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\picture\\小丑.png");
        FileOutputStream fos = new FileOutputStream("D:\\IOtest\\filetest\\小丑.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        fos.write(data);
        fos.close();
        fis.close();
    }
}
