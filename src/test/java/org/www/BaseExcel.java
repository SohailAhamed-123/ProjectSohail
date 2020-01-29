package org.www;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseExcel {
	
	static WebDriver driver;
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\FirstMaven\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	public static void loadurl(String url) {
		driver.get(url);
	}
	
	public static void getTitle() {
		String title=driver.getTitle();
	}
	
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}
	
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void SBI(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
		
	}
	
	public static void btnclick(WebElement e) {
		e.click();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static String getDataFromExcel(int rowNo,int cellNo) throws Throwable{
		
		File loc=new File("C:\\Users\\welcome\\eclipse-workspace\\FirstMaven\\Excel\\Book1.xlsx");
		String value=null;
		FileInputStream stream=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(stream);
	    Sheet s=w.getSheet("Sheet1");
	    Row r=s.getRow(rowNo);
	    Cell c=r.getCell(cellNo);
	    int type = c.getCellType();
	    
	    if(type==1) {
	    	
	    	value = c.getStringCellValue();
	    	
	    }
	    
	    else if(type==0) {
	    	if(DateUtil.isCellDateFormatted(c)){
	    		Date dateCellValue = c.getDateCellValue();
	    		SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
	    		 value = sim.format(dateCellValue);
	    	}
	    	
	    	else {
	    	double numericCellValue = c.getNumericCellValue();
	    	long l=(long)numericCellValue;
	    	value = String.valueOf(l);
	    	}
	    	
	    	
	    		
	    		
	    
	    }
		return value;
	    
		
		
		
		
		
		
		
		
		
		
	}  

}
