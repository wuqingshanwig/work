package wigmore;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Work2 {
    private static String str = "";

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\IOtest\\99table.txt");
        FileOutputStream fos = new FileOutputStream(file);
        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {
                str += j + "*" + i + "=" + i * j + "\t";

            }
            str += "\r\n";
        }
        fos.write(str.getBytes());
        fos.close();

    }
}
