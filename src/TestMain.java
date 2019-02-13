import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by walte on 2018/7/19.
 */
public class TestMain {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("D:\\miya.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int rows = sheet.getPhysicalNumberOfRows();
            //System.out.println(rows);
            for(int i = 1; i < rows; i++){
                XSSFRow row = sheet.getRow(i);
                System.out.println(row.getCell(0)+","+row.getCell(1)+","+row.getCell(2)+","+row.getCell(3)+","+row.getCell(4)+","+row.getCell(5));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
