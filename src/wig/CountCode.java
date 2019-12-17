package wig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 统计一个.Java文件有多少行代码,不包含空行和注释
 */
public class CountCode {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("D:\\java\\projects\\Workspace\\work\\src\\wigmore\\Work.java");
        BufferedReader br = new BufferedReader(fr);
        String str = null;
        int count = 0;
        while((str = br.readLine()) != null){
            if (str.trim().equals("") || str.trim().startsWith("/*") || str.trim().startsWith("//") || str.trim().startsWith("*")) {
                continue;//除去空行以及注释代码
            }else{

            count++;
            }



        }
        System.out.println("这个Java文件有"+ count + "行");

    }
}
