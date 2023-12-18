package utils;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String,String>>excelReaderMethod(String excelFilePath,String sheetName){


        List<Map<String,String>> allEmployeesMaps=new ArrayList<>();
        try(FileInputStream fis=new FileInputStream(excelFilePath);
            XSSFWorkbook workbook=new XSSFWorkbook(fis);
                ) {
            Sheet sheet=workbook.getSheet(sheetName);
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
           // System.out.println(allEmployeesMaps);

        } catch (IOException e) {
            e.printStackTrace();
        }
     return allEmployeesMaps;
    }
}

