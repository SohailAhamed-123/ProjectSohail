package org.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass {

	public static void main(String[] args) {
		
		launchBrowser();
		loadurl("http://www.facebook.com/");
		getTitle();
		getCurrentUrl();
		WebElement u = driver.findElement(By.id("email"));
		fill(u,"Suresh");
		
		WebElement p = driver.findElement(By.id("pass"));
		fill(p,"Farith");
		
		WebElement date = driver.findElement(By.id("day"));
		SBI(date,5);
		
		WebElement month = driver.findElement(By.id("month"));
		SBI(month,8);
		
		WebElement button = driver.findElement(By.id("loginbutton"));
		btnclick(button);
		
		getCurrentUrl();
		quitBrowser();
		
		
		
		
	

	}

}
