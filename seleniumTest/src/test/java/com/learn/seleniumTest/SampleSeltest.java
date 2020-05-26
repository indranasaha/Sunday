package com.learn.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleSeltest {
	WebDriver driver;
	
	@Test
	public void Testmethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rana\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");  
		driver=new ChromeDriver();
		driver.navigate().to("http://www.javatpoint.com/");
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor)driver;  
	     js.executeScript("scrollBy(0, 5000)");
	     driver.findElement(By.linkText("Core Java")).click();
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 driver.quit();
		
	}

}
