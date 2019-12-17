package wig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 判断一个字符文件中指定的字符串出现的次数,以及出现的具体位置(第几行第几个字符)
 */
public class CountChar {
    private static int count =0;//字符在字符串中出现的次数.
    private static Map<Integer,Integer> charLocal = new HashMap<Integer,Integer>();//行和具体位置的映射

    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("Test");
        BufferedReader br = new BufferedReader(fr);
       String str = null;
        while((str = br.readLine()) != null){
          counts(str);

        }
    }
    public static int  counts(String str){
        while (str.contains("我的")){
            count++;
        }
        return count;
    }
    public static Map find (String str){

        return null;
    }
}
