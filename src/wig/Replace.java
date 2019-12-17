package wig;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.Arrays;

/**
 * 读取一个字符文件,将字符文件中的敏感词汇替换成"*"号,并重新输出成新的字符文件.
 * 敏感词汇列表在keyword.txt中编写,多个词汇使用逗号分隔
 */
public class Replace {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("keywords.txt"));
//创建一个缓冲流并指定文件的位置
        String keywordsStr = br.readLine();//创建一个字符串来接收文件中的内容
        String[] keywords = keywordsStr.split(",");//将字符串拆分成String数组

        br.close();
        br = new BufferedReader(new FileReader("Test"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Test_copy.txt"));
// 创建一个写出的缓冲流,并指定路径
        String line = null;
        while ((line = br.readLine()) != null) {
            for (String keyword : keywords) {
                char[] charArray = new char[keyword.length()];
                Arrays.fill(charArray, '*');
                line = line.replace(keyword, new String(charArray));
            }
            System.out.println(line);
            bw.write(line);
            bw.newLine();
        }

        bw.close();
        br.close();

    }

}
