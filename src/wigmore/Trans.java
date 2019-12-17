package wigmore;

import java.io.*;

public class Trans {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("D:\\java\\projects\\Workspace\\work\\src\\wigmore\\gbk");
        InputStreamReader itr = new InputStreamReader(fis,"GBK");
        BufferedReader br = new BufferedReader(itr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\java\\projects\\Workspace\\work\\src\\wigmore\\utf8"), "utf-8"));
        String str = null;
        while ((str = br.readLine()) !=null){
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();
        itr.close();
        fis.close();

    }
}
