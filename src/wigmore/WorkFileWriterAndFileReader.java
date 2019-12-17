package wigmore;

import java.io.FileWriter;
import java.io.IOException;

public class WorkFileWriterAndFileReader {
    private static String str = "";
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("D:\\IOtest\\99.txt");
        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {
                str += j + "*" + i + "=" + i * j + "\t";

            }
            str += "\r\n";
        }
        fw.write(str);
        fw.close();
    }
}
