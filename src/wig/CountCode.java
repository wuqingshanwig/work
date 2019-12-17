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
        int count1 = 0;
        int count2 = 0;
        while((str = br.readLine()) != null){
            if (str.startsWith("/**")){
                count1++;
            }else if(str.startsWith("//")) {

                 count2++;








            }
            else {
                count++;

            }


        }
        System.out.println("文档注释有" + count1 + "行" + "普通注释有" + count2 + "行" + "代码有" + count + "行");

    }
}
