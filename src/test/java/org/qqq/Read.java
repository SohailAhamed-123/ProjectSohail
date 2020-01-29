package org.qqq;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\FirstMaven\\Excel\\Book1.xlsx");
		
		FileInputStream st = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(st);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c);
		 int rowcount = s.getPhysicalNumberOfRows();
		 System.out.println(rowcount);
		 
		 int cellcount = r.getPhysicalNumberOfCells();
		 System.out.println(cellcount);
		 
		 for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			 
			Row row = s.getRow(i);
for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				System.out.print(cell);

			
			
				
				
				
			}
System.out.println();
			
		}
		 
		
		
	}
}


