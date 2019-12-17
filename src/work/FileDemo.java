package work;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\IOtest\\fileTest");
       // boolean mkdirs = file.mkdirs();
       // System.out.println(mkdirs);
        //System.out.println("........................");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        file.renameTo(new File("D:\\IOtest\\filetest"));

    }
}
