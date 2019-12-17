package work;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("D:\\IOtest\\a.txt");
        fw.write("如同天上降魔主,真乃人间太岁神!");
        fw.flush();
    }
}
