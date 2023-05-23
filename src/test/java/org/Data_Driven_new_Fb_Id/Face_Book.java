package org.Data_Driven_new_Fb_Id;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.expectThrows;

import java.io.IOException;

import org.Data_Driven_FB_Base_Class.FB_Base_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Face_Book extends FB_Base_Class {
	//used data driven wright and read
	//assert concept
	public static void main(String[] args) throws IOException {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.xpath("//input[@id='email']"));
		sendkey(findElement, getexcel("facebook", "fb", 1, 1));
		WebElement findElement1 = driver.findElement(By.xpath("//input[@id='pass']"));
		sendkey(findElement1, getexcel("facebook", "fb", 1, 2));
		WebElement findElement2 = driver.findElement(By.xpath("//button[@name='login']"));
		clk(findElement2);
		gettitle(driver);
		String actualtitle = gettitle(driver);
		String expecttitle="Log in to Facebook";
		assertEquals(actualtitle, expecttitle);
		String actualurl= getcurrenturl(driver);
		String expecurl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgzMjA1Nzg0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		assertNotEquals(actualurl, expecurl);
		String actualborder = driver.findElement(By.xpath("//input[@id='email']")).getCssValue("border");
		String expectborder="1px solid rgb(240, 40, 73)";
		assertEquals(actualtitle, expecttitle);
		
		WebElement log = driver.findElement(By.xpath("//input[@id='email']"));
		sendkey(log, getexcel("facebook", "fb", 2, 1));
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		sendkey(pass, getexcel("facebook", "fb", 2, 2));
		WebElement cl = driver.findElement(By.xpath("//button[@name='login']"));
		clk(cl);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
