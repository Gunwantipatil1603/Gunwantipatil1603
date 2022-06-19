package org.exceloperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowEx1 {

	//private static final String PhysicalNumCells = null;

	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./ExelFile/TextData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("StringTestData");
		
		int LastRowNum = s1.getLastRowNum();
		System.out.println("LastRowNum = "+LastRowNum);
		
		int PhysicalNumRows= s1.getPhysicalNumberOfRows();
		System.out.println("PhysicalNumRows = "+PhysicalNumRows);
	
		Row r1 = s1.getRow(0);
		
		int lastCellNum = r1.getLastCellNum();
		System.out.println("lastCellNum = "+lastCellNum);
		
		int physicalNumberCells = r1.getPhysicalNumberOfCells();
		System.out.println("physicalNumCells = "+physicalNumberCells);
	}
}
