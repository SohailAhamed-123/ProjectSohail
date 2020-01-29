package org.www;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
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
	
	
	
	

	

	}


