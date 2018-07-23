import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            //通过反射加载驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try
                (
                        //通过驱动获得连接
                        Connection c = DriverManager.getConnection("jdbc:mysql://120.78.66.3:3306/walter?useUnicode=true&characterEncoding=utf-8&useSSL=false",
                                "root",
                                "root");
                        //获得statement对象
                        Statement s = c.createStatement();
                )
        {


                String sql = "select * from id ";
            List<String> ids = new ArrayList<>();
                ResultSet set = s.executeQuery(sql);
                while(set.next()){
                    String id = set.getString("s");
                    ids.add(id);
                }
            File file = new File("D:\\ids.txt");
            OutputStream os = null;
            try {

                os = new FileOutputStream(file,true);
                String string =ids.toString();
                byte[] data = string.getBytes();

                os.write(data, 0, data.length);
                os.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("文件没有找到！");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("写入文件失败！");
            }finally {
                if (os != null) {
                    try {
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("关闭输出流失败！");
                    }
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
