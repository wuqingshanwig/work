package wigmore;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharPicture {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("D:\\IOtest\\filetest\\小丑.png");
        FileWriter fw = new FileWriter("D:\\IOtest\\filetest2\\小丑.png");
        char[] chars = new char[512];
        int length = 0;
        while ((length = fr.read(chars)) != -1){
            fw.write(chars,0,length);
        }
        fw.close();
        fr.close();
    }
}
