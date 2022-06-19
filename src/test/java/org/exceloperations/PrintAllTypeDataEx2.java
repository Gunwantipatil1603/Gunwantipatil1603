package org.exceloperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllTypeDataEx2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./ExelFile/TextData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet s1 = wb.getSheet("AllTypeTestData");
	
		
		for(int k=1; k<=s1.getLastRowNum(); k++)
		{
			Row r1 = s1.getRow(k);
			for(int  i=0; i<r1.getLastCellNum(); i++)
			{
				CellType ct =r1.getCell(i).getCellType();
				switch(ct) {
					case STRING:System.out.println(r1.getCell(i).getStringCellValue());
					break;
					
					case NUMERIC:System.out.println(r1.getCell(i).getNumericCellValue());
						if(DateUtil.isCellDateFormatted(r1.getCell(i))) {
							Date dt = r1.getCell(i).getDateCellValue();
							SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
							
							System.out.println(sdf.format(dt));
						}else {
							System.out.println((long)r1.getCell(i).getNumericCellValue());
						}
					break;
					
					case BOOLEAN:System.out.println(r1.getCell(i).getBooleanCellValue());
					break;
					
					case FORMULA:System.out.println(r1.getCell(i).getCellFormula());
					break;
					
					case BLANK:System.out.println("Cell is Blank");
					break;
					
					default:System.out.println("invalid cell");
				}			
			}
			System.out.println();
		}
	}

}
