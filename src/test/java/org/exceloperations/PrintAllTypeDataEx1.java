package org.exceloperations;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllTypeDataEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./ExelFile/TextData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet s1 = wb.getSheet("AllTypeTestData");
	
		
		for(int k=1; k<=s1.getLastRowNum(); k++)
		{
			Row r1 = s1.getRow(k);
			for(int  i=0; i<r1.getLastCellNum(); i++)
			{
				System.out.println(r1.getCell(i).getCellType());
			}
			System.out.println();
		}
	}

}
