package com.adder;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Adder {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        int a = 5;
        int b = 2;

        add(a,b);

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Example");

        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Hello");
        row.createCell(1).setCellValue("Excel");
    }

    public static int add(int a, int b) {
        int c = a + b;
        System.out.println( a + " + " + b + " = " + c);
        return c;
    }

}