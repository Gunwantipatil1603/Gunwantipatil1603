package org.exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllStringDataEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./ExelFile/TextData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("StringTestData");
		
		Row r1 = s1.getRow(1);
		
		Cell c1 = r1.getCell(0);
		
		String data = c1.getStringCellValue();
		System.out.println(data);
		
		for(int  i=0; i<r1.getLastCellNum(); i++)
		{
			System.out.println(r1.getCell(i).getStringCellValue());
		}
		
		
		
		
		
	}

}
