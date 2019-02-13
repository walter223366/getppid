import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        InputStream in = new FileInputStream("C:\\Users\\walte\\Desktop\\dmsS.txt");
        //写入相应的文件
        OutputStream out = new FileOutputStream("C:\\Users\\walte\\Desktop\\dms.txt");
        //读取数据
        //一次性取多少字节
        byte[] bytes = new byte[2048];
        //接受读取的内容(n就代表的相关数据，只不过是数字的形式)
        int n = -1;
        //循环取出数据
        String str = null;
        while ((n = in.read(bytes,0,bytes.length)) != -1) {
            //转换成字符串
            str = new String(bytes,0,n,"GBK");
            System.out.println(str);
            //写入相关文件

        }
        str=str.replaceAll(" ","");
        //关闭流
        in.close();
        out.write(str.getBytes(), 0, n);
        out.flush();
        out.close();
    }
}
