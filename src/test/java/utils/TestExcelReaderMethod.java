package utils;

import java.util.List;
import java.util.Map;

public class TestExcelReaderMethod {
    public static void main(String[] args) {
        List<Map<String, String>> maps = ExcelReader.excelReaderMethod(Constants.EXCEL_FILE_PATH, "Sheet1");

        maps.forEach(x-> System.out.println(x));

    }
}