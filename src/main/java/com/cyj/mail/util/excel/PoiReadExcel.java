package com.cyj.mail.util.excel;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.IOException;

/**
 * @author cyj
 */
public class PoiReadExcel {

    /**
     * POI解析Excel文件内容
     */
    public static void main(String[] args) {

        //需要解析的Excel文件
        File file = new File("e:/poi_test.xls");
        try {
            //创建Excel，读取文件内容
            HSSFWorkbook workbook =
                    new HSSFWorkbook(FileUtils.openInputStream(file));
            //获取第一个工作表workbook.getSheet("Sheet0");
//			HSSFSheet sheet = workbook.getSheet("Sheet0");
            //读取默认第一个工作表sheet
            HSSFSheet sheet = workbook.getSheetAt(0);
            int firstRowNum = 0;
            //获取sheet中最后一行行号
            int lastRowNum = sheet.getLastRowNum();
            for (int i = firstRowNum; i <= lastRowNum; i++) {
                HSSFRow row = sheet.getRow(i);
                //获取当前行最后单元格列号
                int lastCellNum = row.getLastCellNum();
                for (int j = 0; j < lastCellNum; j++) {
                    HSSFCell cell = row.getCell(j);
                    String value = cell.getStringCellValue();
                    System.out.print(value + "  ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

