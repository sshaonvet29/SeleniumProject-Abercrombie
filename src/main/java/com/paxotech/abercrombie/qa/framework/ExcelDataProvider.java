package com.paxotech.abercrombie.qa.framework;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by PaxoTech Student on 7/15/2016.
 */
public class ExcelDataProvider {

    public static String[][] excelDataProvider(String xlPath, String xlSheet) throws IOException {
        File file = new File(xlPath);
        FileInputStream fis = new FileInputStream(file);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet ws = wb.getSheet(xlSheet);
        int xlRows = ws.getLastRowNum() + 1;
        int xlCols = ws.getRow(0).getLastCellNum();
        String[][] xlData = new String[xlRows][xlCols];
        for (int i = 1; i < xlRows; i++) {
            HSSFRow row = ws.getRow(i);
            String value = "_";
            for (int j = 1; j < xlCols; j++) {
                HSSFCell cell = row.getCell(j);
                if (cell != null) {
                    value = cellToString(cell);

                }
                xlData[i][j] = value;
            }
        }
        return xlData;

    }


    public static  String cellToString(HSSFCell cell) {

        Object result;
        int type = cell.getCellType();
        switch (type) {

            case HSSFCell.CELL_TYPE_BOOLEAN:
                new RuntimeException("Can not handle Boolean type");
            case HSSFCell.CELL_TYPE_STRING:
                result = cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_NUMERIC:
                result = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_ERROR:
                throw new RuntimeException("Can not handle error!");
            case HSSFCell.CELL_TYPE_FORMULA:
                throw new RuntimeException("Can not handle Formula type");
            case HSSFCell.CELL_TYPE_BLANK:
                result = "%";
                break;
            default:
                throw new RuntimeException("Do not Support this type");

        }
        return result.toString();
    }

}