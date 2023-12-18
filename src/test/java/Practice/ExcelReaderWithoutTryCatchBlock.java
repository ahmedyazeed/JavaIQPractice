package Practice;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReaderWithoutTryCatchBlock {

    public static void main(String[] args) throws IOException {

    List<Map<String,String>> empList=new ArrayList<>();


        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");
        Row headerRow= sheet.getRow(0);


        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Map<String,String> empMap=new LinkedHashMap<>();
            Row row= sheet.getRow(i);



            for (int j = 0; j <row.getPhysicalNumberOfCells() ; j++) {

            //    Cell cell= row.getCell(j);
               // System.out.println(cell.toString());
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                empMap.put(key,value);


            }//System.out.println(empMap);
            empList.add(empMap);

        }
        System.out.println(empList);


    }
}
