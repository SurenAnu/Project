package com.Instra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
			}
	
	
	@FindBy(id = "email")
	private WebElement login;
	
	@FindBy(id = "pass")
	private WebElement password;
		
	@FindBy(linkText = "Create new account")
	private WebElement btn;
		
	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getBtn() {
		return btn;
	}

	@FindBy(id = "day")
	private WebElement day;

	public WebElement setDay() {
		return day;
	}

	@FindBy(name = "firstname")
	private WebElement firstname;




	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(linkText = "Settings")
	private WebElement yah;

	public WebElement getYah() {
		return yah;
	}









	
	

	




























	
	
	
	
	
	
	
	
	
}
