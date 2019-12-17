package work;


import java.io.FileReader;
import java.io.IOException;

public class ＤemoFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\IOtest\\a.txt");
//        int length = 0;
//        while ((length = fr.read()) !=-1){
//            System.out.print((char) length);
//        }
        char[] cs = new char[1024];
        int length = 0;
        while ((length = fr.read(cs)) !=-1){
            System.out.println(new String(cs, 0, length));
        }


        fr.close();


    }
}
