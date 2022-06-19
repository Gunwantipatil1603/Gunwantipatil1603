package org.exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SheetEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./ExelFile/TextData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int numofSheets= wb.getNumberOfSheets();
		System.out.println("Total Sheets= "+numofSheets);
		
		int index = wb.getSheetIndex("StringTestData");
		System.out.println("index : "+index);
		
		String SheetName = wb.getSheetName(1);
		System.out.println("sheet at index 1 :"+SheetName);
		System.out.println("**********************");
		System.out.println("All sheet Name: ");
		for(int i=0; i<numofSheets; i++) {
			System.out.println(wb.getSheetName(i));
		}
	
	}
}
