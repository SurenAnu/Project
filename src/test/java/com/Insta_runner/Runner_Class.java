package com.Insta_runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.Base_class.Class_one;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import com.Instra.Login_Page;

public class Runner_Class extends Class_one {
	
	
public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("incognito");
	WebDriver driver = new ChromeDriver(opt);
	Login_Page findmethod = new Login_Page(driver);
	url(driver, "https://www.facebook.com/");
	max(driver);
	
	implicit(driver);
	sendkey(findmethod.getLogin(), "surendhar@gmail.com");
	sendkey(findmethod.getPassword(), "12345");
	winhand(driver);
	winhans(driver);
	click(findmethod.getBtn());
	sendkey(findmethod.getFirstname(), "anu");
	select(findmethod.setDay(), 5);
	options(findmethod.setDay());
	sel_all_opt(findmethod.setDay());
	tourl(driver, "https://search.yahoo.com/search?fr=mcafee&type=E211US1274G0&p=filehippo");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
	rightcl(driver, findmethod.getYah());
	down(driver);
	enter(driver);
	
}
}
