package wig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 判断一个字符文件中指定的字符串出现的次数,以及出现的具体位置(第几行第几个字符)
 */
public class CountChar {
    public static void main(String[] args) throws IOException{
        String str = "儿子";
        FileReader fr = new FileReader("Test");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        int lineCount = 0;
        int count = 0;
        while((line = br.readLine()) != null){
            lineCount++;
            int index = -str.length();
            while ((index = line.indexOf(str,index+str.length()))>-1){
                System.out.println("该字符串出现在"+lineCount+"行"+index+"位置");
                count++;
            }

        }
       br.close();
        fr.close();
        System.out.println("出现" + count +"次");
    }
}
