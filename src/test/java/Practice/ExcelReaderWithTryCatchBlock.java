package Practice;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderWithTryCatchBlock {
    public static void main(String[] args) {


        List<Map<String,String>> allEmployeesMaps=new ArrayList<>();
        try(FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
            XSSFWorkbook workbook=new XSSFWorkbook(fis);
                ) {
            Sheet sheet=workbook.getSheet("Sheet1");
            Row headerRow= sheet.getRow(0);
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row= sheet.getRow(i);
                Map<String,String> oneEmployeeMap=new LinkedHashMap<>();

                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

                    String key=headerRow.getCell(j).toString();
                    String value=row.getCell(j).toString();
                    oneEmployeeMap.put(key,value);

                }/*System.out.println(oneEmployeeMap);
                System.out.println();*/

                allEmployeesMaps.add(oneEmployeeMap);
            }
            System.out.println(allEmployeesMaps);

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

