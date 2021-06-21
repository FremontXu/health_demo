package com.fremont.test;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

/**
 * @Author：xuhongfei
 * @Version：1.0
 * @Date：2021/6/18-16:23
 * @Since:jdk1.8
 * @Description:TODO
 */
public class POITest {

    @Test
    public void testPoi() throws IOException {
//        //创建工作簿
//        XSSFWorkbook workbook = new XSSFWorkbook("E:\\poi.xlsx");
//        //获取工作表，既可以根据工作表的顺序获取，也可以根据工作表的名称获取
//        XSSFSheet sheet = workbook.getSheetAt(0);
////获取当前工作表最后一行的行号，行号从0开始
//        int lastRowNum = sheet.getLastRowNum();
//        for (int i = 0; i <= lastRowNum; i++) {
//            //根据行号获取行对象
//            XSSFRow row = sheet.getRow(i);
//            short lastCellNum = row.getLastCellNum();
//            for (short j = 0; j < lastCellNum; j++) {
//                String value = row.getCell(j).getStringCellValue();
//                System.out.println(value);
//            }
//        }
//        workbook.close();

        String path="哈哈哈";
        System.out.println(path);


    }
}
