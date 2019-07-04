package com.selenium.test1.maven_project1;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven {
	public static void main(String []args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\selenium download chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		WebElement ele=driver.findElement(By.id("LoginForm_username"));
	    ele.sendKeys("vaishnavima");
	    WebElement ele1=driver.findElement(By.id("LoginForm_password"));
		ele1.sendKeys("v@ishu123");
		WebElement ele2=driver.findElement(By.name("yt0"));
		ele2.click();
		Thread.sleep(5000);
		
			
    //hgjhfh
	
	}
}


