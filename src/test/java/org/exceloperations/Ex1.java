package org.exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./ExelFile/TextData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
Sheet s1 = wb.getSheet("StringTestData");
		
		int lastRowNum = s1.getLastRowNum();
		System.out.println("LastRowNum = "+lastRowNum);
		for(int i=0; i<=lastRowNum; i++) {
			Row r1 = s1.getRow(i);
			int lastcellNum=r1.getLastCellNum();
			System.out.println("lastcellNum for row "+i+" = "+lastcellNum);
		}
	}
}
