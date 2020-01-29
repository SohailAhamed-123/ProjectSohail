package org.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainExcel extends BaseExcel {

	public static void main(String[] args) throws Throwable {
		launchBrowser();
		loadurl("http://www.facebook.com/");
		getTitle();
		getCurrentUrl();
		WebElement u = driver.findElement(By.id("email"));
		fill(u,getDataFromExcel(1, 0));
		
		WebElement p = driver.findElement(By.id("pass"));
		fill(p,getDataFromExcel(2, 0)); 

	}

}
