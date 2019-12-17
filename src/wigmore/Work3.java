package wigmore;

import java.io.File;
import java.util.Scanner;

public class Work3 {
    private static int count1 = 0;
    private static int count2 = 0;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入任意文件目录:");
        File file = new File(input.next());
        f1(file);

    }
    public static void f1(File f) {
        if (f.exists()) {
            File[] listFiles = f.listFiles();
            for(File ff : listFiles) {
                if (ff.isDirectory()) {
                    f1(ff);
                    System.out.println("目录:" + ff.getAbsolutePath());
                    count1++;
                } else {
                    count2++;
                    System.out.println("文件:" + ff.getAbsolutePath());
                }
            }
        } else {
            System.out.println("抱歉，文件不存在!");
        }
        System.out.println("文件个数为" + count2);
        System.out.println("目录个数为" + count1);

    }

}
