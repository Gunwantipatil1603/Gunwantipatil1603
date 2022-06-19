package org.exceloperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteEx1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./ExelFile/TextData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet s1 = wb.getSheet("WriteEx");
				
		s1.getRow(1).createCell(3).setCellValue("Pass");
		s1.getRow(2).createCell(3).setCellValue("Pass");
		s1.getRow(3).createCell(3).setCellValue("fail");
		
		FileOutputStream fos =new FileOutputStream("./ExelFile/TextData.xlsx");
		wb.write(fos);
		fos.close();
	}

}
