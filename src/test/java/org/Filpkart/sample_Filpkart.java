package org.Filpkart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sample_Filpkart{
     
	@Test
	public void start() {
		List<String> rr = new ArrayList<>();
		Map<String, String> refname = new TreeMap<>();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone%2014&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		List<WebElement> phone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int size = price.size(); System.out.println("Size"+size);
		
		String text2 ="";
		
		for (int i = 0; i < size; i++) {
	WebElement webElement = phone.get(i);
	String text = webElement.getText();
	
		
	WebElement webElement2 = price.get(i);
	 text2 = webElement2.getText();
	
	refname.put(text, text2);
	rr.add(i, text2);
	
		}	
		for (Entry<String, String> webElement : refname.entrySet()) {
			
			
			System.out.println(webElement.getKey()+"   "+webElement.getValue());
		}
		
		
		String min = Collections.min(rr); System.out.println(min);
		String max = Collections.max(rr); System.out.println(max);
		
		driver.quit();
	
		
		
		
	}
}
